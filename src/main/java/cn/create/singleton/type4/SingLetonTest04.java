package cn.create.singleton.type4;

/**
 * @Author 原野
 * @DATE 2023/9/18 8:56
 * @Description: 懒汉式(线程安全，同步方法)
 * @Version 1.0
 */
public class SingLetonTest04 {
    public static void main(String[] args) {

//        System.out.println("懒汉式 2 ， 线程安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

    }
}
/**
 1) 解决了线程安全问题
 2) 效率太低了，每个线程在想获得类的实例时候，执行 getInstance()方法都要进行同步。而其实这个方法只执行
 一次实例化代码就够了，后面的想获得该类实例，直接 return 就行了。方法进行同步效率太低
 3) 结论：在实际开发中，不推荐使用这种方式
 */
class Singleton{

    private static Singleton singleton;

    private Singleton(){};

    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    //即懒汉式
    public static synchronized Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }
}

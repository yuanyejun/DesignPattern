package cn.create.singleton.type2;

/**
 * @Author 原野
 * @DATE 2023/9/15 10:32
 * @Description: 饿汉式 静态代码块
 * @Version 1.0
 */
public class SingletonTest02 {
    public static void main(String[] args) {

        //test
        Singleton instance1 =Singleton.getInstance();
        Singleton instance2 =Singleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = " + instance1.hashCode());
        System.out.println("instance2.hashCode() = " + instance1.hashCode());

    }
}

/**
 * 静态代码块实现饿汉式单例模式
 */
class Singleton{

    // 创建实例对象变量
    private final  static Singleton instance;

    //1. 构造器私有化, 外部能 new
    private Singleton(){}

    static { // 在静态代码块中，创建单例对象
        instance = new Singleton();
    }

    //3. 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }



}

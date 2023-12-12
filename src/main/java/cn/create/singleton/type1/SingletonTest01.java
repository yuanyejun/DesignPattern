package cn.create.singleton.type1;

/**
 * @Author 原野
 * @DATE 2023/9/15 10:13
 * @Description: 饿汉式
 * @Version 1.0
 */

//1) 构造器私有化 (防止 new )
//2) 类的内部创建对象
//3) 向外暴露一个静态的公共方法。getInstance
//4) 代码实现
public class SingletonTest01 {
    public static void main(String[] args) {

        //test
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = " + instance1.hashCode());
        System.out.println("instance2.hashCode() = " + instance1.hashCode());

    }

}

/**
 *  1)饿汉式(静态常量)
 *  2)饿汉式（静态代码块)
 *
 * 3)懒汉式(线程不安全)
 *  4)懒汉式(线程安全，同步方法)
 *  5)懒汉式(线程安全，同步代码块)
 *
 *  6)双重检查
 *  7)静态内部类
 *  8)枚举
 */

/**
 * 1) 优点：这种写法比较简单，就是在类装载的时候就完成实例化。避免了线程同步问题。
 * 2) 缺点：在类装载的时候就完成实例化，没有达到 Lazy Loading 的效果。如果从始至终从未使用过这个实例，则
 *          会造成内存的浪费
 * 3) 结论：这种单例模式可用，可能造成内存浪费
 */
class Singleton{

    //1 构造器私有化 外部不能new
    private Singleton(){}

    // 2 本类内部创建对象实例
    private final  static Singleton instance = new Singleton();

    //3 提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }

}


package cn.create.singleton.type5;

/**
 * @Author 原野
 * @DATE 2023/9/18 9:00
 * @Description: 懒汉式 线程安全 同步代码块
 * @Version 1.0
 */
public class SingLetonTest05 {
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
 *  1)       起到了 Lazy Loading 的效果，但是只能在单线程下使用。
 *
 *  2)       如果在多线程下，一个线程进入了
 *          if (singleton == null)判断语句块，还未来得及往下执行，
 *          另一个线程也通过
 *          了这个判断语句，这时便会产生多个实例。
 *          所以在多线程环境下不可使用这种方式
 *
 * 3) 结论：在实际开发中，不要使用这种方式.
 */


/**
 *  这种方式同步并不能起到线程同步的作用 和第三种差不多
 */
// 不推荐使用 (复习同步方式及内容)
class Singleton{

    private Singleton(){}

    private static Singleton singleton;

    //同步代码块
    public static Singleton getInstance(){

        if (singleton == null){

            synchronized (Singleton.class){
                singleton = new Singleton();
            }
        }

        return singleton;
    }

}

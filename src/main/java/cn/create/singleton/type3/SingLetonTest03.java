package cn.create.singleton.type3;

/**
 * @Author 原野
 * @DATE 2023/9/18 8:48
 * @Description: 懒汉式 线程不安全
 * @Version 1.0
 */
public class SingLetonTest03 {

    public static void main(String[] args) {


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

        SingletonDemo instance1 = SingletonDemo.getInstance();
        SingletonDemo instance2 = SingletonDemo.getInstance();

        System.out.println(instance2 == instance1);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }

}

class SingletonDemo{

    private static SingletonDemo singleton;

    private SingletonDemo(){}

    //提供一个静态的公有方法，当使用到该方法时，才去创建 instance
    //即懒汉式
    public static SingletonDemo getInstance(){
        if (singleton == null){
            singleton = new SingletonDemo();
        }
        return singleton;
    }



}

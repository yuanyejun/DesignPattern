package cn.create.singleton.type6;


/**
 * @Author 原野
 * @DATE 2023/9/18 9:07
 * @Description: 单例模式 双重检查
 * @Version 1.0
 */
public class SingLetonTest06 {
    public static void main(String[] args) {

        System.out.println("双重检查");
        SingLeton instance = SingLeton.getInstance();
        SingLeton instance2 = SingLeton.getInstance();
        System.out.println(instance == instance2); // true
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());

    }
}

/**
 1) Double-Check 概念是多线程开发中常使用到的，
        如代码中所示，我们进行了两次 if (singleton == null)检查，这样就可以保证线程安全了。

 2) 这样，实例化代码只用执行一次，后面再次访问时，判断 if (singleton == null)，直接 return 实例化对象，也避
        免的反复进行方法同步.

 3) 线程安全；延迟加载；效率较高

 4) 结论：在实际开发中，推荐使用这种单例设计模式


 */

//双重检查案例
class SingLeton{

    //
    private SingLeton(){}

    //
    private static SingLeton instance;

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题, 同时解决懒加载问题
    //同时保证了效率, 推荐使用
    public static SingLeton getInstance(){
        if (instance == null){
            synchronized (SingLeton.class){
                if (instance == null){
                    instance = new SingLeton();
                }
            }
        }
        return instance;
    }

}

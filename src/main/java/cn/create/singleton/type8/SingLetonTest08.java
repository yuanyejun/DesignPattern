package cn.create.singleton.type8;

/**
 * @Author 原野
 * @DATE 2023/9/18 9:34
 * @Description: 枚举方式实现单例模式
 * @Version 1.0
 */
public class SingLetonTest08 {
    public static void main(String[] args) {

        Singleon instance = Singleon.INSTANCE;
        Singleon instance2 = Singleon.INSTANCE;

        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());

        instance.sayOk();
        instance2.sayOk();

    }
}

/**
 1) 这借助 JDK1.5 中添加的枚举来实现单例模式。
        不仅能避免多线程同步问题，而且还能防止反序列化重新创建
        新的对象。

 2) 这种方式是 Effective Java 作者 Josh Bloch 提倡的方式

 3) 结论：推荐使用


 */


//使用枚举，可以实现单例, 推荐
enum Singleon{

    INSTANCE; //属性

    public void sayOk(){
        System.out.println("ok!!!");
    }



}

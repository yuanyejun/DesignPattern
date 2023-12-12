package cn.create.prototype;

/**
 * @Author 原野
 * @DATE 2023/9/19 8:32
 * @Description: 传统方式解决克隆🐏问题
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        //传统的方法
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

    }

    /**

     1) 优点是比较好理解，简单易操作。

     2) 在创建新的对象时，总是需要重新获取原始对象的属性，如果创建的对象比较复杂时，效率较低

     3) 总是需要重新初始化对象，而不是动态地获得对象运行时的状态, 不够灵活

     4) 改进的思路分析
     思路：Java 中 Object 类是所有类的根类，Object 类提供了一个 clone()方法，该方法可以将一个 Java 对象复制
     一份，但是需要实现 clone 的 Java 类
     必须要实现一个接口 Cloneable，该接口
     表示该类能够复制且具有复制的能力 =>  原型模式


     */
}

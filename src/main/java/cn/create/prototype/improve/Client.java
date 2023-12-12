package cn.create.prototype.improve;



/**
 * @Author 原野
 * @DATE 2023/9/19 8:42
 * @Description: 原型模式解决克隆羊问题
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        Sheep sheep = new Sheep("tom-max-plus", 1, "白色");
        sheep.friend = new Sheep("jack",2,"黑色");

        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();

        System.out.println(sheep1 + "sheep1.friend" + sheep1.friend.hashCode());
        System.out.println(sheep2 + "sheep2.friend" + sheep1.friend.hashCode());
        System.out.println(sheep3 + "sheep3.friend" + sheep1.friend.hashCode());
        System.out.println(sheep4 + "sheep4.friend" + sheep1.friend.hashCode());

        System.out.println(sheep1.hashCode());
        System.out.println(sheep2.hashCode());
        System.out.println(sheep3.hashCode());
        System.out.println(sheep4.hashCode());


    }
}

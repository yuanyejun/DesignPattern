package cn.structure.decorator;

/**
 * @Author 原野
 * @DATE 2023/10/8 9:13
 * @Description:
 * @Version 1.0
 */
public class CoffeeBar {
    public static void main(String[] args) {

        // 装饰者模式下的订单：2 份巧克力+一份牛奶的 LongB

        Drink order = new LongBlack();
        System.out.println("cost1:" + order.cost());
        System.out.println("des1:" + order.getDes());

        System.out.println("-----");

        order = new Milk(order);
        System.out.println("order 加入一份牛奶" + order.cost());
        System.out.println("order 加入一份牛奶 描述" + order.getDes());

        System.out.println("-----");

        order = new Chocolate(order);
        System.out.println("order 加入一份巧克力" + order.cost());
        System.out.println("order 加入一份巧克力 描述" + order.getDes());

        System.out.println("-----");

        order = new Chocolate(order);
        System.out.println("order 加入二份巧克力" + order.cost());
        System.out.println("order 加入二份巧克力 描述" + order.getDes());

    }
}

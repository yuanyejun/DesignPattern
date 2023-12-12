package cn.create.factory.absfactory.order;

/**
 * @Author 原野
 * @DATE 2023/9/18 16:03
 * @Description:
 * @Version 1.0
 */
public class PizzaStore {
    public static void main(String[] args) {

//        new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());

    }
}

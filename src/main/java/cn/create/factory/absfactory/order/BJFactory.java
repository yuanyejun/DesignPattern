package cn.create.factory.absfactory.order;


import cn.create.factory.absfactory.pizza.BJCheesePizza;
import cn.create.factory.absfactory.pizza.BJPepperPizza;
import cn.create.factory.absfactory.pizza.Pizza;

/**
 * @Author 原野
 * @DATE 2023/9/18 15:41
 * @Description:
 * @Version 1.0
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {

        System.out.println("使用的是抽象工厂模式");
        Pizza pizza = null;

        if (orderType.equals("cheess")){
            pizza = new BJCheesePizza();
        }else  if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}

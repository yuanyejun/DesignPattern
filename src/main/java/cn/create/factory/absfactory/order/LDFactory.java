package cn.create.factory.absfactory.order;


import cn.create.factory.absfactory.pizza.LDCheessPizza;
import cn.create.factory.absfactory.pizza.LDPepperPizza;
import cn.create.factory.absfactory.pizza.Pizza;


/**
 * @Author 原野
 * @DATE 2023/9/18 15:41
 * @Description:
 * @Version 1.0
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {

        Pizza pizza = null;

        if (orderType.equals("cheess")){
            pizza = new LDCheessPizza();
        }else  if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}

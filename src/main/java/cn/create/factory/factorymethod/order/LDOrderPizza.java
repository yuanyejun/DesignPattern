package cn.create.factory.factorymethod.order;


import cn.create.factory.factorymethod.pizza.LDCheessPizza;
import cn.create.factory.factorymethod.pizza.LDPepperPizza;
import cn.create.factory.factorymethod.pizza.Pizza;


/**
 * @Author 原野
 * @DATE 2023/9/18 15:15
 * @Description:
 * @Version 1.0
 */
public class LDOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheess")){
            pizza = new LDCheessPizza();
        }else if (orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }

        return pizza;
    }
}

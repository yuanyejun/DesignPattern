package cn.create.factory.factorymethod.order;


import cn.create.factory.factorymethod.pizza.BJCheesePizza;
import cn.create.factory.factorymethod.pizza.BJPepperPizza;
import cn.create.factory.factorymethod.pizza.Pizza;


/**
 * @Author 原野
 * @DATE 2023/9/18 15:15
 * @Description:
 * @Version 1.0
 */
public class BJOrderPizza extends OrderPizza {


    @Override
    Pizza createPizza(String orderType) {

        Pizza pizza = null;
        if (orderType.equals("cheess")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }

        return pizza;
    }
}

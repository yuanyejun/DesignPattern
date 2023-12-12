package cn.create.factory.simplefactory.order;

import cn.create.factory.simplefactory.pizza.CheesePizza;
import cn.create.factory.simplefactory.pizza.GreekPizza;
import cn.create.factory.simplefactory.pizza.PepperPizza;
import cn.create.factory.simplefactory.pizza.Pizza;

/**
 * @Author 原野
 * @DATE 2023/9/18 14:18
 * @Description: 简单工厂类
 * @Version 1.0
 */
public class SimpleFactory {
    public static void main(String[] args) {

    }

    //根据orderType 返回对应的pizza对象
    public Pizza createPizza(String orderType){

        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("greek");
        }else  if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }else  if (orderType.equals("lajiao")){
            pizza = new PepperPizza();
            pizza.setName("lajiao");
        }

        return pizza;
    }

    //简单工厂模式也叫静态工厂模式
    public static Pizza createPizza2(String orderType){

        Pizza pizza = null;
        System.out.println("使用简单工厂模式");
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("greek");
        }else  if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("cheese");
        }else  if (orderType.equals("lajiao")){
            pizza = new PepperPizza();
            pizza.setName("lajiao");
        }

        return pizza;
    }
}

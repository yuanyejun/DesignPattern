package cn.create.factory.absfactory.order;

import cn.create.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author 原野
 * @DATE 2023/9/18 15:47
 * @Description:
 * @Version 1.0
 */
public class OrderPizza {

    AbsFactory absFactory;


    //构造器
     public OrderPizza(AbsFactory absFactory){
         setFactory(absFactory);
     }

     private void setFactory(AbsFactory factory){
        Pizza pizza = null;
        String orderType = ""; //用户输入

        this.absFactory = factory;

        do {
            orderType = getType();
            // factory可能是北京的工厂子类  也可能是伦敦的工厂子类
            pizza = factory.createPizza(orderType);

            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败...");
                break;
            }
        }while (true);
    }

    //写一个方法，可以获取客户希望订购的披萨种类
    private String getType(){
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = reader.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}

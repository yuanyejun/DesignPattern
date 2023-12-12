package cn.create.factory.simplefactory.order;

import cn.create.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author 原野
 * @DATE 2023/9/18 14:47
 * @Description:
 * @Version 1.0
 */
public class OrderPizza2 {

    Pizza pizza;
    String orderType;

    //构造器
    public OrderPizza2(){
        do {
            orderType = getType();
            pizza = SimpleFactory.createPizza2(orderType);

            //输出pizza
            if (pizza != null){ //订购成功

                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();

            }else {
                System.out.println("订购披萨失败");
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

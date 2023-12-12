package cn.create.factory.simplefactory.order;

import cn.create.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author 原野
 * @DATE 2023/9/18 11:02
 * @Description:
 * @Version 1.0
 */
public class OrderPizza {


    //构造器
//    public OrderPizza(){

//        Pizza pizza = null;
//        String orderType; // 订购披萨的类型
//        do {
//            orderType = getType();
//            if (orderType.equals("greek")){
//                pizza = new GreekPizza();
//                pizza.setName("greek");
//            }else  if (orderType.equals("cheese")){
//                pizza = new CheesePizza();
//                pizza.setName("cheese");
//            }else  if (orderType.equals("lajiao")){
//                pizza = new PepperPizza();
//                pizza.setName("lajiao");
//            } else {
//                break;
//            }
//            //输出pizza制作过程
//            pizza.prepare();
//            pizza.bake();
//            pizza.cut();
//            pizza.box();
//
//        }while (true);

//    }


    //构造器
    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public  void setFactory(SimpleFactory simpleFactory){
        String orderType; //用户输入的
        this.simpleFactory = simpleFactory; //设置简单工厂对象

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

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

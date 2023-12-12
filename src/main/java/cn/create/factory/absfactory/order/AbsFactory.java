package cn.create.factory.absfactory.order;

import cn.create.factory.absfactory.pizza.Pizza;

/**
 * @Author 原野
 * @DATE 2023/9/18 15:40
 * @Description: 一个抽象工厂模式的抽象层 接口
 * @Version 1.0
 */
public interface AbsFactory {

    //让下面的工厂类来具体实现
    Pizza createPizza(String orderType);

}

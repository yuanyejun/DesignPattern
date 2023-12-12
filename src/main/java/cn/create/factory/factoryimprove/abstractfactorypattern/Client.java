package cn.create.factory.factoryimprove.abstractfactorypattern;

import cn.create.factory.factoryimprove.abstractfactorypattern.inter.Color;
import cn.create.factory.factoryimprove.abstractfactorypattern.inter.Shape;

/**
 * @Author 原野
 * @DATE 2023/10/17 13:47
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        AbstractFactory color = FactoryProducer.getFactory("color");
        Color red = color.getColor("red");
        red.fill();


        AbstractFactory shape = FactoryProducer.getFactory("shape");
        Shape square = shape.getShape("square");
        square.draw();


    }
}

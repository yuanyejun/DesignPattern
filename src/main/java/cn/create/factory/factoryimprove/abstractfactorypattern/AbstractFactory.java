package cn.create.factory.factoryimprove.abstractfactorypattern;

import cn.create.factory.factoryimprove.abstractfactorypattern.inter.Color;
import cn.create.factory.factoryimprove.abstractfactorypattern.inter.Shape;

/**
 * @Author 原野
 * @DATE 2023/10/17 13:42
 * @Description:
 * @Version 1.0
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}

package cn.create.factory.factoryimprove.abstractfactorypattern;

import cn.create.factory.factoryimprove.abstractfactorypattern.impl.Blue;
import cn.create.factory.factoryimprove.abstractfactorypattern.impl.Green;
import cn.create.factory.factoryimprove.abstractfactorypattern.impl.Red;
import cn.create.factory.factoryimprove.abstractfactorypattern.inter.Color;
import cn.create.factory.factoryimprove.abstractfactorypattern.inter.Shape;


/**
 * @Author 原野
 * @DATE 2023/10/17 13:43
 * @Description:
 * @Version 1.0
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}

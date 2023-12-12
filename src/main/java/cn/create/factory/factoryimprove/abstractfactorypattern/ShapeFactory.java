package cn.create.factory.factoryimprove.abstractfactorypattern;

import cn.create.factory.factoryimprove.abstractfactorypattern.impl.Circle;
import cn.create.factory.factoryimprove.abstractfactorypattern.impl.Rectangle;
import cn.create.factory.factoryimprove.abstractfactorypattern.impl.Square;
import cn.create.factory.factoryimprove.abstractfactorypattern.inter.Color;
import cn.create.factory.factoryimprove.abstractfactorypattern.inter.Shape;


/**
 * @Author 原野
 * @DATE 2023/10/17 13:42
 * @Description:
 * @Version 1.0
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}

package cn.create.factory.factoryimprove.abstractfactorypattern;

/**
 * @Author 原野
 * @DATE 2023/10/17 13:45
 * @Description:
 * @Version 1.0
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }

}

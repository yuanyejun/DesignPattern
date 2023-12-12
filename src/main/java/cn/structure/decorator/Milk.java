package cn.structure.decorator;

/**
 * @Author 原野
 * @DATE 2023/10/8 9:04
 * @Description:
 * @Version 1.0
 */
public class Milk extends Decorator{

    public Milk(Drink obj) {
        super(obj);
        setDes("牛奶");
        setPrice(2.0f); //调味品的价格
    }
}

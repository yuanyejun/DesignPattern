package cn.structure.decorator;

/**
 * @Author 原野
 * @DATE 2023/10/8 9:04
 * @Description:
 * @Version 1.0
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink obj) {
        super(obj);
        setDes("巧克力");
        setPrice(3.0f); //调味品的价格
    }
}

package cn.structure.decorator;

/**
 * @Author 原野
 * @DATE 2023/10/8 9:04
 * @Description:
 * @Version 1.0
 */
public class Soy extends Decorator{

    public Soy(Drink obj) {
        super(obj);
        setDes("豆浆");
        setPrice(1.5f); //调味品的价格
    }
}

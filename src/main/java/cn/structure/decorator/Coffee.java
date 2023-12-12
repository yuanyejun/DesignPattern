package cn.structure.decorator;

/**
 * @Author 原野
 * @DATE 2023/10/8 8:57
 * @Description:
 * @Version 1.0
 */
public class Coffee extends Drink{

    @Override
    public float cost() {
        return super.getPrice();
    }
}

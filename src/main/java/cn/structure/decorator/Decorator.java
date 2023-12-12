package cn.structure.decorator;

/**
 * @Author 原野
 * @DATE 2023/10/8 9:00
 * @Description:
 * @Version 1.0
 */
public class Decorator extends Drink{

    private Drink obj;

    public Decorator(Drink obj) { //组合
        this.obj = obj;
    }

    @Override
    public float cost() {
        // super.getPrice() 自己的价格
        return super.getPrice() + obj.cost();
    }


    @Override
    public String getDes() {
        return super.des + "" + super.getDes() + "&&" + obj.getDes();
    }
}

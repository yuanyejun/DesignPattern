package cn.create.factory.simplefactory.pizza;

/**
 * @Author 原野
 * @DATE 2023/9/18 11:01
 * @Description:
 * @Version 1.0
 */
public class PepperPizza extends Pizza{
    @Override
    public void prepare() {

        System.out.println("给辣椒披萨准备原材料");
    }
}

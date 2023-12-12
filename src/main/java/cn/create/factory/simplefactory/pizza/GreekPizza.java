package cn.create.factory.simplefactory.pizza;

/**
 * @Author 原野
 * @DATE 2023/9/18 11:00
 * @Description:
 * @Version 1.0
 */
public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给希腊披萨 准备原材料");
    }
}

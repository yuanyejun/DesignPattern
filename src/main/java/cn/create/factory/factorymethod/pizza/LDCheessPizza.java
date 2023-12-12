package cn.create.factory.factorymethod.pizza;

/**
 * @Author 原野
 * @DATE 2023/9/18 15:03
 * @Description:
 * @Version 1.0
 */
public class LDCheessPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪披萨");
        System.out.println("伦敦奶酪披萨制作中。。。");
    }
}

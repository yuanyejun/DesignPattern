package cn.create.factory.factorymethod.pizza;

/**
 * @Author 原野
 * @DATE 2023/9/18 15:02
 * @Description:
 * @Version 1.0
 */
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京胡椒披萨");
        System.out.println("北京胡椒披萨制作中。。。。");
    }
}

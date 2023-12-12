package cn.create.factory.absfactory.pizza;




/**
 * @Author 原野
 * @DATE 2023/9/18 15:01
 * @Description:
 * @Version 1.0
 */
public class BJCheesePizza extends Pizza {

    @Override
    public void prepare() {
        setName("北京奶酪披萨");
        System.out.println("北京奶酪披萨制作中。。。。");
    }
}

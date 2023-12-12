package cn.create.factory.absfactory.pizza;



/**
 * @Author 原野
 * @DATE 2023/9/18 15:03
 * @Description:
 * @Version 1.0
 */
public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦胡椒披萨");
        System.out.println("伦敦胡椒披萨制作中。。。");
    }
}

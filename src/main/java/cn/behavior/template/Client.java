package cn.behavior.template;

/**
 * @Author 原野
 * @DATE 2023/10/12 8:59
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        SoyaMilk pennutSoyaMilk = new PennutSoyaMilk();
        pennutSoyaMilk.make();



        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();

    }
}

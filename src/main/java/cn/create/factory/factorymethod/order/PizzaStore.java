package cn.create.factory.factorymethod.order;

/**
 * @Author 原野
 * @DATE 2023/9/18 15:20
 * @Description:
 * @Version 1.0
 */
public class PizzaStore {
    public static void main(String[] args) {

        String loc = "bj";
        if (loc.equals("bj")){
            new BJOrderPizza();
        }else {
            new LDOrderPizza();
        }


        //创建北京口味的披萨
//        new BJOrderPizza();

        //创建伦敦口味的披萨
//        new LDOrderPizza();
    }
}

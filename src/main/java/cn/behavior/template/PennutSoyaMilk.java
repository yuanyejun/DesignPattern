package cn.behavior.template;

/**
 * @Author 原野
 * @DATE 2023/10/12 9:00
 * @Description: 抽象类 表示豆浆
 * @Version 1.0
 */
public class PennutSoyaMilk extends SoyaMilk{


    @Override
    void add() {
        System.out.println("加入上好的花生");
    }
}

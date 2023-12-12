package cn.behavior.template.improve;

/**
 * @Author 原野
 * @DATE 2023/10/12 9:14
 * @Description:
 * @Version 1.0
 */
public class PureSoyaMilk extends SoyaMilk{
    @Override
    void add() {

    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}

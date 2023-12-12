package cn.behavior.visitor;

/**
 * @Author 原野
 * @DATE 2023/10/13 8:58
 * @Description:
 * @Version 1.0
 */
public class Man extends Person{



    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }
}

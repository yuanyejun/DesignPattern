package cn.behavior.visitor;

/**
 * @Author 原野
 * @DATE 2023/10/13 9:13
 * @Description:
 * @Version 1.0
 */
public class Wait extends Action{
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的评价是待定。。。");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的评价是待定。。。");
    }
}

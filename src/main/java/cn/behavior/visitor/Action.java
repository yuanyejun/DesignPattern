package cn.behavior.visitor;

/**
 * @Author 原野
 * @DATE 2023/10/13 8:57
 * @Description:
 * @Version 1.0
 */
public abstract class Action {

    //得到男性的评分
    public abstract void getManResult(Man man);

    //得到女性的评分
    public abstract void getWomanResult(Woman woman);
}

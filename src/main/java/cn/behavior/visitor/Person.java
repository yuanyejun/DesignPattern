package cn.behavior.visitor;

/**
 * @Author 原野
 * @DATE 2023/10/13 8:59
 * @Description:
 * @Version 1.0
 */
public abstract class Person {


    //提供一个方法 让访问者可以访问
    public abstract void accept(Action action);
}

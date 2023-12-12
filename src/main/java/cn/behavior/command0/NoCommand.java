package cn.behavior.command0;

/**
 * @Author 原野
 * @DATE 2023/10/12 10:10
 * @Description:
 * @Version 1.0
 */
//没有任何命令 即空执行 用于初始化每个按钮
//当调用空命令时 对象什么都不做 其实 这样是一种设计模式 可以省掉对空的判断
public class NoCommand implements Command{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}

package cn.behavior.command0;

/**
 * @Author 原野
 * @DATE 2023/10/12 9:43
 * @Description: 创建命令接口
 * @Version 1.0
 */
public interface Command {

    void execute(); //执行动作

    void undo(); //取消
}

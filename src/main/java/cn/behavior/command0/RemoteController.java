package cn.behavior.command0;

/**
 * @Author 原野
 * @DATE 2023/10/12 9:45
 * @Description:
 * @Version 1.0
 */
public class RemoteController {

    //开按钮的命令数组
    Command[] onCommands;
    Command[] offCommands;

    //执行撤销的命令
    Command undoCommand;

    //构造器 完成对按钮初始化
    public RemoteController() {

        onCommands = new Command[5];
        offCommands = new Command[5];

        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    //给按钮设置需要的命令
    public void setCommand(int no, Command onCommand, Command offCommand) {
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

}

 
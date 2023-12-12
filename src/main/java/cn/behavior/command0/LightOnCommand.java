package cn.behavior.command0;

/**
 * @Author 原野
 * @DATE 2023/10/12 9:43
 * @Description:
 * @Version 1.0
 */
public class LightOnCommand implements Command{

    //聚合lightreceiver
    LightReceiver lightReceiver;

    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        lightReceiver.on();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        lightReceiver.off();
    }
}

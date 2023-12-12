package cn.behavior.command0;

/**
 * @Author 原野
 * @DATE 2023/10/12 9:44
 * @Description:
 * @Version 1.0
 */
public class LightOffCommand implements Command{

    //聚合lightreceiver
    LightReceiver lightReceiver;

    public LightOffCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        lightReceiver.off();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        lightReceiver.on();
    }
}

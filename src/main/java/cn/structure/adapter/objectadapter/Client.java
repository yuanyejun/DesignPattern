package cn.structure.adapter.objectadapter;


/**
 * @Author 原野
 * @DATE 2023/9/21 9:05
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("类适配器模式========");
        Phone phone = new Phone();

        Voltage220V voltage220V = new Voltage220V();
        IVoltage5V voltageAdapter = new VoltageAdapter(voltage220V);

        phone.charming(voltageAdapter);

    }
}

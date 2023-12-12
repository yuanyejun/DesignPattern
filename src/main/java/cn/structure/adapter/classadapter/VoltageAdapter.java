package cn.structure.adapter.classadapter;

/**
 * @Author 原野
 * @DATE 2023/9/21 9:00
 * @Description:
 * @Version 1.0
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{

    @Override
    public int output5V() {
        //获取220v电压
        int srcV = output220V();
        int dstV = srcV / 44; //转成5v电压

        return dstV;

    }
}

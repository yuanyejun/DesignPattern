package cn.structure.adapter.objectadapter;

/**
 * @Author 原野
 * @DATE 2023/9/21 9:00
 * @Description: 适配器类
 * @Version 1.0
 */
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V; //关联关系的聚合

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {

        int dst = 0;
        if (null != voltage220V){
            int src = voltage220V.output220V(); //获取到220v
            System.out.println("使用对象适配器 进行转换");
            dst = src / 44;
            System.out.println("适配完成 输出的电压为:" + dst);
        }

        return dst;
    }
}

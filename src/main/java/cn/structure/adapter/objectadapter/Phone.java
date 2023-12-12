package cn.structure.adapter.objectadapter;

/**
 * @Author 原野
 * @DATE 2023/9/21 9:11
 * @Description:
 * @Version 1.0
 */
public class Phone {

    //充电
    public void charming(IVoltage5V iVoltage5V){
        if (iVoltage5V.output5V() == 5){

            System.out.println("电压为5v，可以充电!!!");
        }else if (iVoltage5V.output5V() > 5){
            System.out.println("电压大于5v，不可以充电!!!");
        }

    }
}

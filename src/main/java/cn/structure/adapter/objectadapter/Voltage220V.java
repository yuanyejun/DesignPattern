package cn.structure.adapter.objectadapter;

/**
 * @Author 原野
 * @DATE 2023/9/21 8:59
 * @Description: 被适配的类
 * @Version 1.0
 */
public class Voltage220V {

    public int output220V(){
        int src = 220;

        System.out.println("电压:" + src);
        return src;
    }

}

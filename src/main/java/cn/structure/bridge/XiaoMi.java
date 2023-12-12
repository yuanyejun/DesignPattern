package cn.structure.bridge;

/**
 * @Author 原野
 * @DATE 2023/9/28 10:11
 * @Description:
 * @Version 1.0
 */
public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("小米开机");
    }

    @Override
    public void close() {
        System.out.println("小米关机");
    }

    @Override
    public void call() {
        System.out.println("小米打电话");
    }
}

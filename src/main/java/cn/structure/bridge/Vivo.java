package cn.structure.bridge;

/**
 * @Author 原野
 * @DATE 2023/9/28 10:11
 * @Description:
 * @Version 1.0
 */
public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("Vivo开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo打电话");
    }
}

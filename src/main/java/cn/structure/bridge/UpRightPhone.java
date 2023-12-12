package cn.structure.bridge;

/**
 * @Author 原野
 * @DATE 2023/10/20 14:03
 * @Description:
 * @Version 1.0
 */
public class UpRightPhone extends Phone {

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open(){
        super.open();
        System.out.println("翻盖样式手机");
    }
    @Override
    public void close(){
        super.close();
        System.out.println("翻盖样式手机关闭");
    }
    @Override
    public void call(){
        super.call();
        System.out.println("翻盖样式手机打电话");
    }
}

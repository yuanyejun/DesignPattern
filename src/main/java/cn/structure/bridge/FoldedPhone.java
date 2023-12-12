package cn.structure.bridge;

/**
 * @Author 原野
 * @DATE 2023/9/28 10:14
 * @Description: 折叠式手机类 继承  抽象手机类
 * @Version 1.0
 */
public class FoldedPhone extends Phone{


    public FoldedPhone(Brand brand) {
        super(brand);
    }
    @Override
    public void open(){
        super.open();
        System.out.println("折叠样式手机");
    }
    @Override
    public void close(){
        super.close();
        System.out.println("折叠样式手机关闭");
    }
    @Override
    public void call(){
        super.call();
        System.out.println("折叠样式手机打电话");
    }

}

package cn.structure.bridge;

/**
 * @Author 原野
 * @DATE 2023/9/28 10:12
 * @Description:
 * @Version 1.0
 */
public abstract class Phone {

    //组合品牌
    private Brand brand;

    //构造器
    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }

    protected void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }

}

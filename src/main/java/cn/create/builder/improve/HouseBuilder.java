package cn.create.builder.improve;

/**
 * @Author 原野
 * @DATE 2023/9/20 9:14
 * @Description: 抽象建造者
 * @Version 1.0
 */
public  abstract class HouseBuilder {

    protected House house = new House();

    //将建造的流程写好  抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    //建造房子 将产品返回
    public House buildHouse(){
        return house;
    }

}

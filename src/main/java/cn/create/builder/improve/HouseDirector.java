package cn.create.builder.improve;

/**
 * @Author 原野
 * @DATE 2023/9/20 9:19
 * @Description: 指挥者
 * @Version 1.0
 */
public class HouseDirector {

    HouseBuilder houseBuilder;

    //构造器传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //通过set传入
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //交给指挥者 处理建造房子的流程
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

}

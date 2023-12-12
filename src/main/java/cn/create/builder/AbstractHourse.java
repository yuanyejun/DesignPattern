package cn.create.builder;

/**
 * @Author 原野
 * @DATE 2023/9/20 8:54
 * @Description: 传统方式 建造者模式
 * @Version 1.0
 */
public abstract class AbstractHourse {

    //打地基
    public abstract void buildBasic();

    //切墙
    public abstract void buildWalls();

    //封顶
    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }

}

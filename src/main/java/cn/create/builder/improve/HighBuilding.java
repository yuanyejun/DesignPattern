package cn.create.builder.improve;

/**
 * @Author 原野
 * @DATE 2023/9/20 9:17
 * @Description:
 * @Version 1.0
 */
public class HighBuilding extends HouseBuilder{


    @Override
    public void buildBasic() {
        System.out.println("高楼 打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高楼 砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高楼 屋顶");
    }
}

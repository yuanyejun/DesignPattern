package cn.create.builder.improve;

/**
 * @Author 原野
 * @DATE 2023/9/20 9:16
 * @Description:
 * @Version 1.0
 */
public class CommonHouse extends HouseBuilder{

    @Override
    public void buildBasic() {
        System.out.println("普通 打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通 砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通 屋顶");
    }
}

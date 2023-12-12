package cn.create.builder;

/**
 * @Author 原野
 * @DATE 2023/9/20 8:56
 * @Description:
 * @Version 1.0
 */
public class CommonHourse extends AbstractHourse{

    @Override
    public void buildBasic() {
        System.out.println("普通房子-打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子-砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("普通房子-盖屋顶");
    }
}

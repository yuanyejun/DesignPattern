package cn.create.factory.factorymethod.pizza;

/**
 * @Author 原野
 * @DATE 2023/9/18 10:56
 * @Description:
 * @Version 1.0
 */
//将pizza做成抽象类
public abstract class Pizza {
    protected String name; //名字

    //准备原材料 不同的pizza不一样 因此 我们做成抽象方法
    public abstract void prepare();


    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    //打包
    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}

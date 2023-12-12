package cn.structure.flyweight;

/**
 * @Author 原野
 * @DATE 2023/10/11 11:12
 * @Description:
 * @Version 1.0
 */
public class ConcreteWebsite extends Website{

    private String type = ""; // 网站发布的形式 类型

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站发布的形式:" + type + "---使用者:" + user.getName());
    }
}

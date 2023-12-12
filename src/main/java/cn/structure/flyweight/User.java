package cn.structure.flyweight;

/**
 * @Author 原野
 * @DATE 2023/10/11 11:24
 * @Description:
 * @Version 1.0
 */
public class User {

    public User(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

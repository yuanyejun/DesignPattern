package cn.structure.composite;

/**
 * @Author 原野
 * @DATE 2023/10/8 10:00
 * @Description: Department 叶子节点
 * @Version 1.0
 */
public class Department extends OrganizationComponent {

    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }
}

package cn.structure.composite;

/**
 * @Author 原野
 * @DATE 2023/10/8 9:49
 * @Description:
 * @Version 1.0
 */
public abstract class OrganizationComponent {

    private String name; //名字
    private String des; //说明

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    protected void add(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent organizationComponent){
        //默认实现
        throw new UnsupportedOperationException();
    }

    //子类需要实现
    protected abstract void print();


}

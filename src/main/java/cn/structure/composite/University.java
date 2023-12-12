package cn.structure.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 原野
 * @DATE 2023/10/8 9:52
 * @Description: University就是comopsite 可以管理college
 * @Version 1.0
 */
public class University extends OrganizationComponent{


    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    //add
    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    //remove
    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //输出University包含的学院
    @Override
    protected void print() {
        System.out.println("----------------------" + getName() + "------------------");
        for (OrganizationComponent item : organizationComponents) {
            item.print();
        }
    }
}

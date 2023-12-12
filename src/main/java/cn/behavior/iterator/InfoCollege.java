package cn.behavior.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author 原野
 * @DATE 2023/10/13 10:00
 * @Description:
 * @Version 1.0
 */
public class InfoCollege implements College{

    List<Department> departmentList;

    public InfoCollege(){
        departmentList = new ArrayList<>();
        addDepartment("信息安全专业", " 信息安全专业 ");
        addDepartment("网络安全专业", " 网络安全专业 ");
        addDepartment("服务器安全专业", " 服务器安全专业 ");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departmentList.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new InfoColleageIterator(departmentList);
    }
}

package cn.behavior.iterator;

import java.util.Iterator;

/**
 * @Author 原野
 * @DATE 2023/10/13 9:55
 * @Description:
 * @Version 1.0
 */
public class ComputerCollege implements College{

    Department[] departments;
    int numOfDepartment = 0; //保存当前数组的对象个数

    public ComputerCollege(){
        departments = new Department[5];
        addDepartment("Java 专业", " Java 专业 ");
        addDepartment("PHP 专业", " PHP 专业 ");
        addDepartment("大数据专业", " 大数据专业 ");

    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}

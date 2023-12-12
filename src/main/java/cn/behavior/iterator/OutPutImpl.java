package cn.behavior.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author 原野
 * @DATE 2023/10/13 10:05
 * @Description:
 * @Version 1.0
 */
public class OutPutImpl {

    //学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //遍历所有学院  然后调用printdepartment 输出各个学院的系
    public void printCollege(){

        //从collegeList 取出所有学院
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("=====" + college.getName() + "=====");
            System.out.println(college.createIterator());
        }

    }

    //输出
    public void printDepartment(Iterator iterator){

        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }

    }
}

package cn.behavior.iterator;

import java.util.Iterator;

/**
 * @Author 原野
 * @DATE 2023/10/13 9:43
 * @Description:
 * @Version 1.0
 */
public class ComputerCollegeIterator implements Iterator {

    //这里我们需要 Department 是以怎样的方式存放
    Department [] departments;
    int position = 0; //遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {

    }


}

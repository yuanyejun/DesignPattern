package cn.behavior.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * @Author 原野
 * @DATE 2023/10/13 9:49
 * @Description:
 * @Version 1.0
 */
public class InfoColleageIterator implements Iterator {
    // 信息工程学院是以 List 方式存
    List<Department> departmentList;
    int index = -1;

    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() -1 ){
            return false;
        }else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departmentList.get(index);
        return department;
    }

    @Override
    public void remove() {

    }
}

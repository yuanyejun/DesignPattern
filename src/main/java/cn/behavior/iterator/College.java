package cn.behavior.iterator;

import java.util.Iterator;

/**
 * @Author 原野
 * @DATE 2023/10/13 9:53
 * @Description:
 * @Version 1.0
 */
public interface College {

    String getName();

    void addDepartment(String name,String desc);

    //返回一个迭代器，遍历
    Iterator createIterator();
}

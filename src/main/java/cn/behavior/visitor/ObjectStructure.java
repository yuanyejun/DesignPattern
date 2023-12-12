package cn.behavior.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author 原野
 * @DATE 2023/10/13 9:04
 * @Description:
 * @Version 1.0
 */
public class ObjectStructure {

    //维护了一个集合
    private List<Person> persons = new LinkedList<>();


    //增加到list
    public void attach(Person person){
        persons.add(person);
    }
    //移除
    public void detach(Person person){
        persons.remove(person);
    }
    //查看
    public void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
    }
}

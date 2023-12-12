package cn.structure.proxy.cglib;

/**
 * @Author 原野
 * @DATE 2023/10/11 17:02
 * @Description:
 * @Version 1.0
 */
public class TeacherDao {

    public void teach(){
        System.out.println("老师授课中，我是cglib代码 不需要实现接口");
    }
}

package cn.structure.proxy.staticproxy;

/**
 * @Author 原野
 * @DATE 2023/10/11 15:25
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        //创建代理对象同时将被代理对象传入形参中
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(new TeacherDao());
        teacherDaoProxy.teach();

    }
}

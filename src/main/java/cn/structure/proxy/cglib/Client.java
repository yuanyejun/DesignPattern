package cn.structure.proxy.cglib;

import cn.structure.proxy.dynamic.TeacherDao;

/**
 * @Author 原野
 * @DATE 2023/10/11 17:18
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        //创建目标对象
        cn.structure.proxy.dynamic.TeacherDao target =
                new cn.structure.proxy.dynamic.TeacherDao();

        //获取到代理对象 并且将目标对象传递给代理对象
        cn.structure.proxy.dynamic.TeacherDao proxyFactory =
                (TeacherDao)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxyFactory.teach();

    }
}

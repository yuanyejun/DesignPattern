package cn.structure.proxy.dynamic;

/**
 * @Author 原野
 * @DATE 2023/10/11 16:45
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        //创建目标对象
        TeacherDao target = new TeacherDao();
        //给目标对象创建代理对象
        ProxyFactory proxyInstance = new ProxyFactory(target);

        ITeacherDao instance = (ITeacherDao) proxyInstance.getProxyInstance();

        //内存中动态生成的代理对象
        System.out.println("proxyInstance:" + instance.getClass());

        //通过代理对象 调用目标对象的方法
        instance.teach();

    }
}

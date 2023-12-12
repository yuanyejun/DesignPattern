package cn.structure.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author 原野
 * @DATE 2023/10/11 17:03
 * @Description:
 * @Version 1.0
 */
public class ProxyFactory implements MethodInterceptor {

    //维护一个目标对象
    private Object target;

    //传入被代理的对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //返回一个代理对象 target对象的代理对象
    public Object getProxyInstance( ){
        //创建工具类
        Enhancer enhancer=new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象 即代理对象
        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib代理模式开始~~~~~");
        Object result =  method.invoke(target, objects);
        System.out.println("cglib代理模式已提交~~~~~");
        return result;
    }
}

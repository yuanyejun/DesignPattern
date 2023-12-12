package cn.create.factory.factoryimprove.factorypattern;

/**
 * @Author 原野
 * @DATE 2023/10/17 13:55
 * @Description: 使用反射机制可以解决每次增加一个产品时，都需要增加一个对象实现工厂的缺点
 * @Version 1.0
 */
public class ShapeFactory {

    public static Object getClass(Class<?extends Shape> clazz) {
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return obj;
    }

    // 省略类型强制转换，支持多态
    public static <T> T getClazz(Class<? extends T> clazz) {
        T obj = null;
        try {
            obj = (T) Class.forName(clazz.getName()).newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return obj;
    }
}

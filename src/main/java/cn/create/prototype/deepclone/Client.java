package cn.create.prototype.deepclone;

/**
 * @Author 原野
 * @DATE 2023/9/19 9:12
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.name = "宋江";
        deepPrototype.deepCloneableTarget = new DeepCloneableTarget("大牛","atm");

        // todo 深拷贝 方式1 使用clone方法
//        DeepPrototype deepPrototype2 = (DeepPrototype)deepPrototype.clone();
//
//        System.out.println("deepPrototype.name=" + deepPrototype.name + ":"  + "deepPrototype.deepCloneableTarget:" + deepPrototype.deepCloneableTarget.hashCode() );
//        System.out.println("deepPrototype2.name=" + deepPrototype2.name + ":"  + "deepPrototype2.deepCloneableTarget:" + deepPrototype2.deepCloneableTarget.hashCode() );

        //todo 深拷贝 方式2 通过序列化实现(推荐)


        DeepPrototype deepPrototype2 = (DeepPrototype)deepPrototype.deepClone();

        System.out.println("deepPrototype.name=" + deepPrototype.name + ":"  + "deepPrototype.deepCloneableTarget:" + deepPrototype.deepCloneableTarget.hashCode() );
        System.out.println("deepPrototype2.name=" + deepPrototype2.name + ":"  + "deepPrototype2.deepCloneableTarget:" + deepPrototype2.deepCloneableTarget.hashCode() );


    }
}

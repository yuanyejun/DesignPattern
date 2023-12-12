package cn.create.factory.factoryimprove.factorypattern;

/**
 * @Author 原野
 * @DATE 2023/10/17 13:53
 * @Description:
 * @Version 1.0
 */
public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

package cn.create.factory.factoryimprove.abstractfactorypattern.impl;

import cn.create.factory.factoryimprove.abstractfactorypattern.inter.Shape;

/**
 * @Author 原野
 * @DATE 2023/10/17 13:39
 * @Description:
 * @Version 1.0
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

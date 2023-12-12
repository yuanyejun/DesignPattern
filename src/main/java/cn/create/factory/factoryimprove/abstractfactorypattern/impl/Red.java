package cn.create.factory.factoryimprove.abstractfactorypattern.impl;

import cn.create.factory.factoryimprove.abstractfactorypattern.inter.Color;

/**
 * @Author 原野
 * @DATE 2023/10/17 13:40
 * @Description:
 * @Version 1.0
 */
public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}

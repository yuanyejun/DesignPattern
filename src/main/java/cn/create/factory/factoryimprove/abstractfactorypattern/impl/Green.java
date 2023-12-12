package cn.create.factory.factoryimprove.abstractfactorypattern.impl;

import cn.create.factory.factoryimprove.abstractfactorypattern.inter.Color;

/**
 * @Author 原野
 * @DATE 2023/10/17 13:41
 * @Description:
 * @Version 1.0
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}

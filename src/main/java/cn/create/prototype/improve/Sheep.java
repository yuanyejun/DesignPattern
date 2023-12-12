package cn.create.prototype.improve;

/**
 * @Author 原野
 * @DATE 2023/9/19 8:31
 * @Description:
 * @Version 1.0
 */
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;
    private String sheep = "沸羊羊";

    public Sheep friend;

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' + ", sheep='" + sheep + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    //克隆该实例，使用默认的 clone 方法来完成
    @Override
    protected Object clone(){

        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }

        return sheep;
    }
}

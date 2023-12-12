package cn.structure.facade;

/**
 * @Author 原野
 * @DATE 2023/10/11 8:49
 * @Description:
 * @Version 1.0
 */
public class TheaterLight {

    //单例模式
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight on");
    }

    public void off(){
        System.out.println("TheaterLight off");
    }

    public void play(){
        System.out.println("TheaterLight play");
    }

    public void pause(){
        System.out.println("TheaterLight pause");
    }
}

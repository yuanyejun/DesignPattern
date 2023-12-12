package cn.structure.facade;

/**
 * @Author 原野
 * @DATE 2023/10/11 8:49
 * @Description:
 * @Version 1.0
 */
public class Stereo {

    //单例模式
    private static Stereo instance = new Stereo();

    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Stereo on");
    }

    public void off(){
        System.out.println("Stereo off");
    }

    public void play(){
        System.out.println("Stereo play");
    }

    public void pause(){
        System.out.println("Stereo pause");
    }
}

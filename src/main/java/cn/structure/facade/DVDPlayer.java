package cn.structure.facade;

/**
 * @Author 原野
 * @DATE 2023/10/11 8:49
 * @Description:
 * @Version 1.0
 */
public class DVDPlayer {

    //单例模式
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("dvd on");
    }

    public void off(){
        System.out.println("dvd off");
    }

    public void play(){
        System.out.println("dvd play");
    }

    public void pause(){
        System.out.println("dvd pause");
    }
}

package cn.structure.facade;

/**
 * @Author 原野
 * @DATE 2023/10/11 8:51
 * @Description:
 * @Version 1.0
 */
public class Projector {

    //单例模式
    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Projector on");
    }

    public void off(){
        System.out.println("Projector off");
    }

    public void play(){
        System.out.println("Projector play");
    }

    public void pause(){
        System.out.println("Projector pause");
    }

}

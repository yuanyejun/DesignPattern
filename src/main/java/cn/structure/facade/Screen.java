package cn.structure.facade;

/**
 * @Author 原野
 * @DATE 2023/10/11 8:49
 * @Description:
 * @Version 1.0
 */
public class Screen {

    //单例模式
    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Screen on");
    }

    public void off(){
        System.out.println("Screen off");
    }

    public void play(){
        System.out.println("Screen play");
    }

    public void pause(){
        System.out.println("Screen pause");
    }
}

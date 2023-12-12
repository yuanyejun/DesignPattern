package cn.structure.facade;

/**
 * @Author 原野
 * @DATE 2023/10/11 8:51
 * @Description:
 * @Version 1.0
 */
public class PopCorn {

    //单例模式
    private static PopCorn instance = new PopCorn();

    public static PopCorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("popcorn on");
    }

    public void off(){
        System.out.println("popcorn off");
    }

    public void play(){
        System.out.println("popcorn play");
    }

    public void pause(){
        System.out.println("popcorn pause");
    }

}

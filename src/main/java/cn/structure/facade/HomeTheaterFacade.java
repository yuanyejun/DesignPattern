package cn.structure.facade;

/**
 * @Author 原野
 * @DATE 2023/10/11 8:56
 * @Description:
 * @Version 1.0
 */
public class HomeTheaterFacade {

    //定义各个子系统对象
    private TheaterLight theaterLight;
    private PopCorn popCorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popCorn = PopCorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    //操作分为4步
    public void ready(){
        popCorn.on();
        popCorn.play();
        screen.on();
        projector.on();
        stereo.on();
        theaterLight.on();
    }

    public void play(){
        screen.play();
        projector.play();
    }

    public void pause(){
        dvdPlayer.pause();
    }



}

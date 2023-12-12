package cn.structure.facade;

/**
 * @Author 原野
 * @DATE 2023/10/11 8:55
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade
                = new HomeTheaterFacade();

        homeTheaterFacade.ready();
        System.out.println("---");
        homeTheaterFacade.play();
        System.out.println("---");
        homeTheaterFacade.pause();

    }
}

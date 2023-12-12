package cn.designpattern;

/**
 * @Author 原野
 * @DATE 2023/9/12 14:41
 * @Description:
 * @Version 1.0
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {

        RoadVechicle road = new RoadVechicle();
        road.run("汽车");

        AirVechicle air = new AirVechicle();
        air.run("飞机");

    }
}

//交通工具类
class RoadVechicle{
    public void run(String vechicle){
        System.out.println(vechicle + "：在路跑");
    }
}

class AirVechicle{
    public void run(String vechicle){
        System.out.println(vechicle + "：在水跑");
    }
}
package cn.designpattern;

/**
 * @Author 原野
 * @DATE 2023/9/12 14:41
 * @Description:
 * @Version 1.0
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {

        Vechicle vechicle = new Vechicle();
        vechicle.run("汽车");
        vechicle.run("摩托车");
        vechicle.run("飞机");
    }
}

//交通工具类
class Vechicle{
    public void run(String vechicle){
        System.out.println(vechicle + "：在公路跑");
    }
}
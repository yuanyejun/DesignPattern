package cn.create.builder.improve;

/**
 * @Author 原野
 * @DATE 2023/9/20 9:19
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        CommonHouse commonHouse = new CommonHouse();
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        houseDirector.constructHouse();

        System.out.println();

        HighBuilding highBuilding = new HighBuilding();
        HouseDirector director = new HouseDirector(highBuilding);
        director.constructHouse();
    }
}

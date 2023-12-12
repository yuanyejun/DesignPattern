package cn.behavior.iterator;

import java.util.ArrayList;

/**
 * @Author 原野
 * @DATE 2023/10/13 10:21
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        //创建学院
        ArrayList<College> collegeList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
//        collegeList.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(collegeList);
        outPut.printCollege();


    }
}

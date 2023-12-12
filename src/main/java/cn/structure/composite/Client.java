package cn.structure.composite;

/**
 * @Author 原野
 * @DATE 2023/10/8 10:02
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        //从大到小创建对象 学校
        OrganizationComponent university = new University("清华大学", "中国顶级大学");

        // 创建 学院
        OrganizationComponent computerCollege = new College("计算机学院", "计算机学院");
        OrganizationComponent infoEngineerCollege = new College("信息工程学院", "信息工程学院");

        //创建各个学院的专业
        computerCollege.add(new Department("软件工程","6666666"));
        computerCollege.add(new Department("网络工程","6666666"));
        computerCollege.add(new Department("计算机科学","6666666"));

        infoEngineerCollege.add(new Department("通信工程","111111111111"));


        //将学院加入到学院中
        university.add(computerCollege);
        university.add(infoEngineerCollege);

        //打印
        university.print();
        System.out.println();
        computerCollege.print();
        System.out.println();
        infoEngineerCollege.print();

    }
}

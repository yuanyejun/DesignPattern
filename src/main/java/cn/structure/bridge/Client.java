package cn.structure.bridge;

/**
 * @Author 原野
 * @DATE 2023/9/28 10:18
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        //获取折叠式手机 样式 + 品牌

        FoldedPhone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.call();
        phone1.close();


        System.out.println();

        UpRightPhone phone2 = new UpRightPhone(new Vivo());
        phone2.open();
        phone2.call();
        phone2.close();
    }
}

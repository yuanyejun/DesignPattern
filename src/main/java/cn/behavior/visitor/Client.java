package cn.behavior.visitor;

/**
 * @Author 原野
 * @DATE 2023/10/13 9:08
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        //success
        Success success = new Success();
        objectStructure.display(success);
        System.out.println();
        //fail
        Fail fail = new Fail();

        objectStructure.display(fail);
        System.out.println();

        Wait wait = new Wait();
        objectStructure.display(wait);

    }
}

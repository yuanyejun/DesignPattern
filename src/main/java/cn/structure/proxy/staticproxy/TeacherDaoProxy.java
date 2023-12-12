package cn.structure.proxy.staticproxy;

/**
 * @Author 原野
 * @DATE 2023/10/11 15:27
 * @Description: 代理对象 静态代理
 * @Version 1.0
 */
public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao target; //目标对象 通过接口来聚合

    //构造器
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理对象开始...");
        target.teach();
        System.out.println("提交...");
    }
}

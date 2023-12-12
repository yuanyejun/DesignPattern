package cn.structure.proxy.staticproxy;

/**
 * @Author 原野
 * @DATE 2023/10/11 15:25
 * @Description:
 * @Version 1.0
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("老师授课中....");
    }
}

package cn.structure.proxy.dynamic;

/**
 * @Author 原野
 * @DATE 2023/10/11 16:35
 * @Description:
 * @Version 1.0
 */
public class TeacherDao implements ITeacherDao{

    @Override
    public void teach() {
        System.out.println("老师正在授课中....");
    }
}

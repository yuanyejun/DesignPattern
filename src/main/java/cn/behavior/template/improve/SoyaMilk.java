package cn.behavior.template.improve;

/**
 * @Author 原野
 * @DATE 2023/10/12 8:57
 * @Description:
 * @Version 1.0
 */
public abstract class SoyaMilk {

    //模板方法 make 模板方法可以做成final 不让子类继承
    final void make(){
        select();
        if (customerWantCondiments()){
            add();
        }
        soak();
        beat();

    }
    //选材料
    private void select() {
        System.out.println("第一步 选择好的新鲜黄豆");
    }

    //添加不同的配料  抽象方法 子类具体实现
    abstract void add();

    private void soak(){
        System.out.println("第三步 黄豆和配料开始侵泡");
    }

    private void beat(){
        System.out.println("第四步 黄豆和配料放到豆浆机去打碎");
    }

    //钩子方法 决定是否要添加配料
    boolean customerWantCondiments(){
        return true;
    }
}

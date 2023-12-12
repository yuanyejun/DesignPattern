package cn.structure.adapter.interfaceadapter;

/**
 * @Author 原野
 * @DATE 2023/9/21 9:28
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        AbsAdapter adapter = new AbsAdapter(){
          //只需要去覆盖我们 需要使用的接口方法
            @Override
            public void m1() {
                System.out.println("使用了m1方法");
            }
        };
        adapter.m1();

        new AbsAdapter(){
            @Override
            public void m2() {
                System.out.println("哇啊哇哇哇");
            }
        }.m2();



    }
}

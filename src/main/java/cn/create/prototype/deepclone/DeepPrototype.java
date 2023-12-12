package cn.create.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 深度拷贝的实现拷贝的两种方式
 * @author Administrator
 *
 */
public class DeepPrototype implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String name;
	public DeepCloneableTarget deepCloneableTarget;

	public DeepPrototype() {
        super();
	}

    // todo 深拷贝 方式1 使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Object deep = null;
        //完成基本数据类型属性和string的克隆
        deep = super.clone();
        // 对引用类型的属性 进行单独处理
        DeepPrototype deepPrototype = (DeepPrototype) deep;
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepPrototype;
    }

    //todo 深拷贝 方式2 通过序列化实现(推荐)
    public Object deepClone() {
        //深度克隆
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //return super.clone();//默认浅克隆，只克隆八大基本数据类型和String
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype copy = (DeepPrototype)ois.readObject();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally{
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

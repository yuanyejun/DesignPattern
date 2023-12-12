package cn.behavior.chain;

/**
 * @Author 原野
 * @DATE 2023/10/16 16:56
 * @Description: /请求类
 * @Version 1.0
 */
public class PurchaseRequest {

    private int type = 0; //请求类型
    private float price = 0.0f; //请求金额
    private int id = 0;

    public PurchaseRequest(int type, float price, int id) {
        this.type = type;
        this.price = price;
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }
}

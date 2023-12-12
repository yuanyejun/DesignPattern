package cn.behavior.chain;

/**
 * @Author 原野
 * @DATE 2023/10/16 16:58
 * @Description:
 * @Version 1.0
 */
public class CollegeApprover extends Approver{

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() < 5000 && purchaseRequest.getPrice() <= 10000) {
            System.out.println(" 请求编号 id= " + purchaseRequest.getId() + " 被 " + this.name + " 处理");
        }else {
            approver.processRequest(purchaseRequest);
        }
    }
}

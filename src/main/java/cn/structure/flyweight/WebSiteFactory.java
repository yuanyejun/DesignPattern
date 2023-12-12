package cn.structure.flyweight;

import java.util.HashMap;

/**
 * @Author 原野
 * @DATE 2023/10/11 11:12
 * @Description: 根据需求返回一个具体的网站
 * @Version 1.0
 */
public class WebSiteFactory {

    //集合 充当池的作业
    private HashMap<String,ConcreteWebsite> pool = new HashMap<>();

    //根据网站类型 返回一个网站 如果没有网站就创建一个网站 并放入池中

    public Website getWebsiteConcrete(String type){
        if (!pool.containsKey(type)){
            //如果没有网站就创建一个网站 并放入池中
            pool.put(type,new ConcreteWebsite(type));
        }

        return (Website) pool.get(type);
    }

    //获取网站分类的总数 池中有多少网站类型
    public int getWebsiteCount(){
        return pool.size();
    }


}

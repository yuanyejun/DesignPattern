package cn.structure.flyweight;

/**
 * @Author 原野
 * @DATE 2023/10/11 11:13
 * @Description:
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {

        //创建一个工厂
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        //新闻
        Website news = webSiteFactory.getWebsiteConcrete("新闻");
        news.use(new User("jack"));

        Website boke = webSiteFactory.getWebsiteConcrete("博客");
        boke.use(new User("tom"));

        Website news2 = webSiteFactory.getWebsiteConcrete("新闻");
        news2.use(new User("jeety"));

        System.out.println(webSiteFactory.getWebsiteCount());


    }
}

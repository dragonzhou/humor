package flyweight;

/**
 * 运用共享技术有效地支持大量细粒度的对象。
 * 
 * @author: zhoujinlong2014169
 * @version: yamen_v3.0
 * @time: 2014-10-16
 */
public class App
{
    
    public static void main(String[] args)
    {
        WebsiteFactory websiteFac = new WebsiteFactory();
        Website wb = websiteFac.getWebsite("blog");
        wb.use(new User("adas"));
    }
}

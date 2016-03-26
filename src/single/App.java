package single;
/**
 * 
 *  保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 功能详细描述
 * @author: zhoujinlong2014169
 * @version: yamen_v3.0 
 * @time: 2014-9-30
 */
public class App
{
    public static void main(String[] args)
    {
        SingletonClass sin1=SingletonClass.getInstance();
        SingletonClass sin2=SingletonClass.getInstance();
        if(sin1 == sin2)
        {
            System.out.println("they are same");
        }
        else
        {
            System.out.println("they are different");
        }
    }
}

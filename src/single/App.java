package single;
/**
 * 
 *  ��֤һ�������һ��ʵ�������ṩһ����������ȫ�ַ��ʵ㡣
 * ������ϸ����
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

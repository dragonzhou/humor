package builder;

/**
 * ��һ�����Ӷ���Ĺ��������ı�ʾ���룬ʹ��ͬ���Ĺ������̿��Դ�����ͬ�ı�ʾ��
 * 
 * @author: zhoujinlong2014169
 * @version: yamen_v3.0
 * @time: 2014-9-30
 */
public class App
{
    public static void main(String[] args)
    {
        PersonDirector pd = new PersonDirector();
        Person person = pd.constructPerson(new ManBuilder());
        System.out.println(person.getBody());
        System.out.println(person.getFoot());
        System.out.println(person.getHead());
    }
    
}

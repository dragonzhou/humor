package factory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * ����һ�����ڴ�������Ľӿڣ����������ʵ������һ���ࡣ һ�仰�������� ������ϸ����
 * 
 * @author: zhoujinlong2014169
 * @version: yamen_v3.0
 * @time: 2014-9-30
 */
public class App
{
    
     IWork studentWorkFactory = new StudentWorkFactory();
     IWork teacherWorkFactory = new TeacherWorkFactory();
     Work w= studentWorkFactory.getWork();
     public static void main(String[] args)
     {
     Work work=Factory.getInstance("factory.TeacherWork");
     if(work!=null)
     {
        work.doWork();   
     }
     }
//    public static void main(String[] args)
//    {
//        try
//        {
//            Properties pro = Init.getPro();
//            System.out.println(pro.getProperty("apple"));
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
    
    // fruit f = Factory.getInstance(pro.getProperty("apple"));
    
}

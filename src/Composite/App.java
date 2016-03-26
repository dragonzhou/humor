package Composite;

import java.util.List;
/**
 * 
 *  ��������ϳ����νṹ�Ա�ʾ"����-����"�Ĳ�νṹ��"Compositeʹ���û��Ե����������϶����ʹ�þ���һ���ԡ�"
 * ������ϸ����
 * @author: zhoujinlong2014169
 * @version: yamen_v3.0 
 * @time: 2014-9-30
 */
public class App
{
    
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        Employer pm = new ProjectManager("��Ŀ����");
        Employer programmer1 = new Programmer("����Աһ");
        Employer programmer2 = new Programmer("����Ա��");
       // Ϊ��Ŀ������ӳ���Ա
        pm.add(programmer2);
        pm.add(programmer1);
        List<Employer> ems = pm.getEmployers();
        for (Employer em : ems)
        {
            System.out.println(em.getName());
        }
        
    }
    
}

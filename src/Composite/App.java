package Composite;

import java.util.List;
/**
 * 
 *  将对象组合成树形结构以表示"部分-整体"的层次结构。"Composite使得用户对单个对象和组合对象的使用具有一致性。"
 * 功能详细描述
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
        Employer pm = new ProjectManager("项目经理");
        Employer programmer1 = new Programmer("程序员一");
        Employer programmer2 = new Programmer("程序员二");
       // 为项目经理添加程序员
        pm.add(programmer2);
        pm.add(programmer1);
        List<Employer> ems = pm.getEmployers();
        for (Employer em : ems)
        {
            System.out.println(em.getName());
        }
        
    }
    
}

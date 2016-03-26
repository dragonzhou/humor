package Composite;

import java.util.List;

/**
 * 定义雇员信息类
 * 
 * @author Administrator
 * 
 */
public abstract class Employer
{
    // 节点名称，比如技术开发部或是人力资源部
    private String name;
    
    public List<Employer> employers;
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public abstract void add(Employer employer);
    
    public abstract void delete(Employer employer);
    
    public void printInfo()
    {
        System.out.println(name);
    }
    
    public List<Employer> getEmployers()
    {
        return employers;
    }
}

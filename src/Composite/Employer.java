package Composite;

import java.util.List;

/**
 * �����Ա��Ϣ��
 * 
 * @author Administrator
 * 
 */
public abstract class Employer
{
    // �ڵ����ƣ����缼������������������Դ��
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

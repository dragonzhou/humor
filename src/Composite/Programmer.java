package Composite;

public class Programmer extends Employer
{
    
    public Programmer(String name)
    {
        super.setName(name);
        employers = null;// ����Ա, ��ʾû��������
    }
    
    @Override
    public void add(Employer employer)
    {
        
    }
    
    @Override
    public void delete(Employer employer)
    {
        
    }
    
}

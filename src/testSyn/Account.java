package testSyn;

public class Account
{
    private String name;
    
    private float amount;
    
    public Account(String name, float amount)
    {
        this.name = name;
        this.amount = amount;
    }
    
    public  void deposit(float amt)
    {
        float tmp = amount;
        tmp += amt;
        
        try
        {
            Thread.sleep(100);// ģ��������������Ҫ��ʱ�䣬����ˢ�����ݿ��
        }
        catch (InterruptedException e)
        {
            // ignore
        }
        
        amount = tmp;
    }
    
    public  void withdraw(float amt)
    {
        float tmp = amount;
        tmp -= amt;
        
        try
        {
            Thread.sleep(100);// ģ��������������Ҫ��ʱ�䣬����ˢ�����ݿ��
        }
        catch (InterruptedException e)
        {
            // ignore
        }
        
        amount = tmp;
    }
    
    public float getBalance()
    {
        return amount;
    }
}

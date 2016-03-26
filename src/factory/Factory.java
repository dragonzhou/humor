package factory;

public class Factory
{
    public static Work getInstance(String className)
    {
        Work work = null;
        try
        {
            work = (Work)Class.forName(className).newInstance();           
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return work;
    }
    
}

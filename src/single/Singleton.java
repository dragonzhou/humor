package single;

/**
 * µ¥ÀýÄ£Ê½
 * 
 * @author BA03020674
 * @version v1.0 2014-9-23
 */
public class Singleton
{
    private static volatile Singleton instance;
    
    private Singleton()
    {
        
    }
    
    public static Singleton getInstance()
    {
        if (null == instance)
        {
            synchronized (Singleton.class)
            {
                if (null == instance)
                {
                    return new Singleton();
                }
            }
        }
        return instance;
    }
}

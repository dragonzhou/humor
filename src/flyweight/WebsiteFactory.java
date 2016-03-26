package flyweight;

import java.util.HashMap;

public class WebsiteFactory
{
    
    private HashMap<String, Website> flyweights = new HashMap<String, Website>();
    
    public Website getWebsite(String key)
    {
        if (null == key)
        {
            return null;
        }
        if (!flyweights.containsKey(key))
        {
            flyweights.put(key, new ConcreteWebsite(key));
        }
        return (Website)flyweights.get(key);
    }
    
    public int getCount()
    {
        return this.flyweights.size();
    }
}

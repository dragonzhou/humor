package dutylink.request;

import dutylink.RequestTypeEnum;

/**
 * º”–Ω«Î«Û
 * 
 * @author: zhoujinlong2014169
 * @version: yamen_v3.0
 * @time: 2014-10-16
 */
public class RaiseMoneyReq extends Request
{
    
    private int expectedMoney;
    
    public RaiseMoneyReq(String name, RequestTypeEnum requestType, int number)
    {
        super(name, requestType, number);
    }
    
    public int getExpectedMoney()
    {
        return expectedMoney;
    }
    
    public RaiseMoneyReq(String name, RequestTypeEnum requestType, int number, int expectedMoney)
    {
        super(name, requestType, number);
        this.expectedMoney = expectedMoney;
    }
    
    public void setExpectedMoney(int expectedMoney)
    {
        this.expectedMoney = expectedMoney;
    }
    
}

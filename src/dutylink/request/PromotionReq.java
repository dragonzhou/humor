package dutylink.request;

import dutylink.RequestTypeEnum;

/**
 * 
 * ÉýÖ°ÇëÇó
 * 
 * @author: zhoujinlong2014169
 * @version: yamen_v3.0
 * @time: 2014-10-16
 */
public class PromotionReq extends Request
{
    
    private String expectedPosition;
    
    public PromotionReq(String name, RequestTypeEnum requestType, int number)
    {
        super(name, requestType, number);
    }
    
    public PromotionReq(String name, RequestTypeEnum requestType, int number, String expectedPosition)
    {
        super(name, requestType, number);
        this.expectedPosition = expectedPosition;
    }
    
    public String getExpectedPosition()
    {
        return expectedPosition;
    }
    
    public void setExpectedPosition(String expectedPosition)
    {
        this.expectedPosition = expectedPosition;
    }
}

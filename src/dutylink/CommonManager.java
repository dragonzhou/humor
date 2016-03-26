package dutylink;

import dutylink.request.PromotionReq;
import dutylink.request.RaiseMoneyReq;
import dutylink.request.Request;

/**
 * 经理，基层管理人员 。只能处理加薪的请求，且加薪额度不大于250
 * 
 * @author Administrator
 * 
 */
public class CommonManager extends Manager
{
    
    public CommonManager(String name)
    {
        super(name);
    }
    
    public void handleRequest(Request request)
    {
        
        if (null == request)
        {
            System.out.println("request is null,please input again");
            return;
        }
        RequestTypeEnum requestType = request.getRequestType();
        if (requestType == RequestTypeEnum.RAISE_MONEY)
        {
            System.out.println("1biaoji");
            if (request instanceof RaiseMoneyReq)
            {
                RaiseMoneyReq raiseMoneyReq = (RaiseMoneyReq)request;
                int money = raiseMoneyReq.getExpectedMoney();
                if (money <= 250)
                {
                    System.out.println("request is approved by " + this.name);
                    
                }
                else
                {
                    System.out.println("2biaoji");
                    if (this.superior != null)
                    {
                        System.out.println("request is out of my duty(" + this.name
                            + "),transfer your request to my superior(" + this.superior.getName() + ")");
                        this.superior.doRequest(request);
                    }
                }
            }
        }
        else
        {
            System.out.println("2biaoji");
            if (this.superior != null)
            {
                System.out.println("request is out of my duty(" + this.name + "),transfer your request to my superior("
                    + this.superior.getName() + ")");
                this.superior.doRequest(request);
            }
        }
    }
    
}

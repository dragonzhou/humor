package dutylink;

import dutylink.request.RaiseMoneyReq;
import dutylink.request.Request;

/**
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链， 并沿着这条链传递该请求，直到有一个对象处理它为止。 这一模式的想法是，给多个对象处理一个请求的机会，从而解耦发送者和接受者.
 * 
 * @author: zhoujinlong2014169
 * @version: yamen_v3.0
 * @time: 2014-10-16
 */
public class App
{
    
    public static void main(String[] args)
    {
        Manager manager = new CommonManager("经理");
        Manager director = new Director("总监");
        Manager generalManager = new GeneralManager("总经理");
        
        manager.setSuperior(director);
        director.setSuperior(generalManager);
        
        RaiseMoneyReq requestOne = new RaiseMoneyReq("加薪", RequestTypeEnum.RAISE_MONEY, 2, 300);
        // Request requestTwo = new Request("加薪", RequestTypeEnum.RAISE_MONEY, 400);
        // Request requestThree = new Request("加薪", RequestTypeEnum.RAISE_MONEY, 600);
        // Request requestFive = new Request("加薪", RequestTypeEnum.RAISE_MONEY, 2000);
        // Request requestSix = new Request("加薪", RequestTypeEnum.PROMOTION, 2000);
        //
        manager.doRequest(requestOne);
        // System.out.println();
        // manager.doRequest(requestTwo);
        // System.out.println();
        // manager.doRequest(requestThree);
        // System.out.println();
        // manager.doRequest(requestFive);
        // System.out.println();
        // manager.doRequest(requestSix);
        
    }
    
}

package dutylink;

import dutylink.request.Request;

/**
 * 总经理，属于管理链条的最高端，具有最高审批、裁决权
 * @author Administrator
 *
 */
public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Request request) {

        
		if(null == request)
		{
			System.out.println("request is null,please input again");
			return;
		}
		if((request.getRequestType() == RequestTypeEnum.RAISE_MONEY) )
		{
			if (request.getNumber() <=1000)
			{
				System.out.println("request is approved by "+this.name);
			}
			else
			{
				System.out.println("request is rejected by "+this.name);
			}
		}
		else
		{
			System.out.println("Demand is too high, can't meet,request is rejected by "+this.name);
		}
	

	}

}

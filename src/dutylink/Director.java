package dutylink;

import dutylink.request.Request;

/**
 * 总监，管理中层
 * @author Administrator
 *
 */
public class Director extends Manager {

	public Director(String name) {
		super(name);		
	}

	@Override
	public void handleRequest(Request request) {

        
		if(null == request)
		{
			System.out.println("request is null,please input again");
			return;
		}
		if((request.getRequestType() == RequestTypeEnum.RAISE_MONEY) && (request.getNumber() <=500))
		{
			System.out.println("request is approved by "+this.name);
		}
		else
		{
			if(this.superior != null)
			{
				System.out.println("request is out of my duty("+this.name+"),transfer your request to my superior("+this.superior.getName()+")");
				this.superior.doRequest(request);
			}
		}
	

	}

}

package dutylink.request;

import dutylink.RequestTypeEnum;

/**
 * 请求信息类
 * @author Administrator
 *
 */
public class Request {
  //请求名称
	private String name;
	//请求类型
	private RequestTypeEnum requestType;
	//请求数量
	private int number;
	
	
	public Request(String name, RequestTypeEnum requestType, int number) {
		super();
		this.name = name;
		this.requestType = requestType;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public RequestTypeEnum getRequestType() {
		return requestType;
	}
	public void setRequestType(RequestTypeEnum requestType) {
		this.requestType = requestType;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}

package dutylink.request;

import dutylink.RequestTypeEnum;

/**
 * ������Ϣ��
 * @author Administrator
 *
 */
public class Request {
  //��������
	private String name;
	//��������
	private RequestTypeEnum requestType;
	//��������
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

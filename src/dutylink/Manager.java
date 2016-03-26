package dutylink;

import dutylink.request.Request;

/**
 * ���������
 * @author Administrator
 *
 */
public abstract class Manager {

	//����������
	protected String name;
	//�������ϼ�
	protected Manager superior;
	public Manager(String name) {
		this.name = name;
	}
	public void setSuperior(Manager superior)
	{
		this.superior=superior;
	}
	
	public void doRequest(Request request)
	{
		if(null ==request)
		{
			return;
		}
		System.out.println("��ǰ��������Ĺ���������:"+name);
		System.out.println("��ǰ������Ϣ��");
		System.out.println("�������ƣ�"+request.getName()+" ,�������ͣ�"+request.getRequestType()+" ,����������"+request.getNumber());
		System.out.println("��ʼ���������.....");
		handleRequest(request);
	}
	public abstract void handleRequest(Request request);
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Manager getSuperior() {
		return superior;
	}
	
}

package dutylink;

import dutylink.request.Request;

/**
 * 抽象管理类
 * @author Administrator
 *
 */
public abstract class Manager {

	//管理者名称
	protected String name;
	//管理者上级
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
		System.out.println("当前处理请求的管理者名称:"+name);
		System.out.println("当前请求信息：");
		System.out.println("请求名称："+request.getName()+" ,请求类型："+request.getRequestType()+" ,请求数量："+request.getNumber());
		System.out.println("开始处理该请求.....");
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

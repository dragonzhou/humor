package flyweight;

public class ConcreteWebsite extends Website {

	private String categoryName;
	
	public ConcreteWebsite(String categoryName)
	{
		this.categoryName=categoryName;
	}
	@Override
	public void use(User user) {
		System.out.println("网站分类："+categoryName+" ,用户名："+user.getName());
		
	}

}

package flyweight;

public class ConcreteWebsite extends Website {

	private String categoryName;
	
	public ConcreteWebsite(String categoryName)
	{
		this.categoryName=categoryName;
	}
	@Override
	public void use(User user) {
		System.out.println("��վ���ࣺ"+categoryName+" ,�û�����"+user.getName());
		
	}

}

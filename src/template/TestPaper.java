package template;

public abstract class TestPaper {

	protected String paperName;

	protected User user;
	public TestPaper(String paperName, User user) {
		super();
		this.paperName = paperName;
		this.user = user;
	}
	public TestPaper(String name) {
		super();
		paperName = name;
	}
	public String getName() {
		return paperName;
	}
	public void setName(String name) {
		paperName = name;
	}
	public void testQuestion1()
	{
		System.out.println("question 1 comes from "+paperName);
		System.out.println("question 1");
		answer1();	
	}
	public abstract void answer1();
	public void testQuestion2()
	{
		System.out.println("question 2 comes from "+paperName);
		System.out.println("question 2");
		answer2();		
	}
	public abstract void answer2();
}

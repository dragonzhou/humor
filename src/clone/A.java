package clone;

public class A
{
    
    public A()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    private int age;
    private String name;
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public A(int age, String name)
    {
        super();
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString()
    {
        return "A [age=" + age + ", name=" + name + "]";
    }
    
}

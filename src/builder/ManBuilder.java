package builder;

public class ManBuilder implements PersonBuilder
{
    
    private Person person;
    
    public ManBuilder()
    {
        person = new Person();
    }
    
    public void buildBody()
    {
        person.setBody("�������˵�����");
        
    }
    
    public void buildFoot()
    {
        person.setFoot("�������˵Ľ�");
        
    }
    
    public void buildHead()
    {
        person.setHead("�������˵�ͷ");
        
    }
    
    public Person buildPerson()
    {
        return this.person;
        
    }
    
}

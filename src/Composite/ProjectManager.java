package Composite;

import java.util.ArrayList;

//项目经理，有下属，不是叶子节点
public class ProjectManager extends Employer
{
    
    public ProjectManager(String name)
    {
        setName(name);
        employers = new ArrayList<Employer>();
    }
    
    public void add(Employer employer)
    {
        employers.add(employer);
    }
    
    public void delete(Employer employer)
    {
        employers.remove(employer);
    }
    
}

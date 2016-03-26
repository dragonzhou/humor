package clone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class App
{
    public static void main(String[] args)
    {
        A a = new A(1, "a");
        A b = new A(2, "b");
        A c = new A(3, "c");
        List<A> listA = new ArrayList<A>();
        Map<Integer, List<A>> map = new HashMap<Integer, List<A>>();
        listA.add(a);
        listA.add(b);
        listA.add(c);
        List<A> listB = new ArrayList<A>();
        listB.add(a);
        listB.add(b);
        listB.add(c);
        map.put(1, listA);
        map.put(2, listB);
        App.display(map);
        System.out.println("+++++++++++++++++++++++");
        A d = new A(4, "d");
        List<A> newAList=map.get(1);
        newAList.add(d);
        map.put(1,newAList );       
        App.display(map);
        
    }
    
    public static void display(Map<Integer, List<A>> map)
    {
        Set<Integer> set = map.keySet();
        for (Integer key : set)
        {
            List<A> list = map.get(key);
            System.out.println(key);
            for (A a : list)
            {
                System.out.println(a.toString());
            }
        }
        
    }
}

package daily.task.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Tanjiro");
		m.put(2, "Zenitsu");
		m.put(3, "Inosuke");
		m.put(4, "Tengen");

		//System.out.println(m);
		
		for(Map.Entry e : m.entrySet())
		{
			System.out.println(e.getKey()+"   "+e.getValue());
		}
		
		System.out.println("--------------------");
		
		for(Object o : m.keySet())
		{
			System.out.println(o+"   "+m.get(o));
		}
		System.out.println("--------------------");
		
		Set s = m.entrySet();	
		Iterator it = s.iterator();
		while(it.hasNext())
		{
			Entry e = (Entry) it.next();
			System.out.println(e.getKey()+"   "+e.getValue());
		}
	}

}

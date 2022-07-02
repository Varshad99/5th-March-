package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetStudy {

	public static void main(String[] args) {
		
        HashSet<Object> hs = new HashSet<>();
		
        hs.add("VELOCITY");
        hs.add(2022);
        hs.add("Testing");
		hs.add(null);
		hs.add(2022);
		
		System.out.println("============");
		System.out.println(hs);
		System.out.println(hs.size());
		
		System.out.println("============");
		Iterator<Object> a = hs.iterator();
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
		
		System.out.println("============");
		for(Object b:hs)
		{
		 System.out.println(b);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

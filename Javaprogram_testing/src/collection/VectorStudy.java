package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		
		Vector<Object> v = new Vector<>();
		
		v.add("VARSHA");
		v.add(3599);
		v.add("NANDED");
		v.add(null);
		v.add("DHOLE");
		v.add(4, "Dhole");
		System.out.println(v);
		System.out.println(v.get(0));
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		System.out.println(v.get(3));
		System.out.println(v.get(4));
		System.out.println("===========");
		
		System.out.println(v.capacity());
		System.out.println(v.size());
		System.out.println(v.contains("DHOLE"));
		System.out.println(v.isEmpty());
		System.out.println(v.indexOf(2));
		System.out.println(v.lastIndexOf(1));
		System.out.println(v.remove(3));
		
		System.out.println("===========");
		for(Object s:v)
		{
			System.out.println(s);
		}
		
		System.out.println("===========");
		Iterator<Object> it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("===========");
		Enumeration<Object> s = v.elements();
		while(s.hasMoreElements())
		{
			System.out.println(s.nextElement());
		}
	
	}

}

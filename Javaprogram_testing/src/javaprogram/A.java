package javaprogram;

public class A {

	public static void main(String[] args) {
		
	
		String  s= "Varsha";
		int lower=0;
		int upper=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>=65 && ch<=90)
			{
				upper++;
				
			}
			else
			{
				lower++;
			}
		
		}
		System.out.println(upper);
		System.out.println(lower);
		
	}

}

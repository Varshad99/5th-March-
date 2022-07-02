package javaprogram;

public class ReverseNumberWithoutString {

	public static void main(String[] args)
	{
		// number=123-->321
		int num=123;
		int rev=0;
		// System.out.println(num/10);
		// System.out.println(num%10);
		
		for(int i=num;i>0;i=i/10)
		{
		 int rem = i%10;//123%10->3, 12%10-->2, 1%10-->1 
		 rev= (rev*10) +rem;//321
		 
		}
		System.out.println(rev);
	}

}

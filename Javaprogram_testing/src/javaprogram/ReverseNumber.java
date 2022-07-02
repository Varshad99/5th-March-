package javaprogram;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		//num=123-->321
		int num= 123;
		// to convert int to String
		String orignal = Integer.toString(num);
		String rev="";
		
		for(int i=orignal.length()-1;i>=0;i--)
		{
		   rev=rev+orignal.charAt(i);
		}
		
		System.out.println(rev);// here rev is in String format
		 
		int revNum = Integer.parseInt(rev);
		
		System.out.println("Orignal Number is "+num);
		System.out.println("Reverse Number is "+revNum);
	}

}

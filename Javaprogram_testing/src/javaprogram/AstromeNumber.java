package javaprogram;

public class AstromeNumber {

	public static void main(String[] args) 
	{
		
		//371
		//3^3+7^3+1^3==371--> armStrong number
		int a=371;
		int num=0;
		// System.out.println(3/10);371//37//3
		//System.out.println(3%10);//1,7,3
		for(int i=a;i>0;i=i/10)
		{
		     int num1=i%10;
		     num=num+(num1*num1*num1);
		}
		    
	    System.out.println("orignal number is "+a);
		System.out.println("addition of digits cube is "+num);
		
		     
		if(a==num)
		{
		    System.out.println("given number is ArmStrong Number");
		}
		else 
		{
		    System.out.println("given number is not ArmStrong Number");
		}


	}

}

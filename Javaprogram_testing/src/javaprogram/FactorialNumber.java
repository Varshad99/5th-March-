package javaprogram;

public class FactorialNumber {

	public static void main(String[] args)
	{
		//3!-->3*2*1=
		int a=5;
		int fact=1;
		
		for(int i=a;i>=1;i--) //5,4,3,2,1
		{
		    fact=i*fact;  //5*1=5;4*5=20;20*3=60;60*2=120;120*1=120
		}
		
		System.out.println("factorial of "+a+" is "+fact);

	}

}

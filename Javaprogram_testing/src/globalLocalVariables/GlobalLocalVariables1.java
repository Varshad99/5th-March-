package globalLocalVariables;

public class GlobalLocalVariables1 {

	int a=10; // non static global variable
	int b=20; // non static global variable
	static int c=30; // static global variable
	static int d=40; // static global variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       GlobalLocalVariables1 g = new GlobalLocalVariables1();//creating object 
       g.addition(); //calling non-static method from same class
       
		sub(); //static from same class
	}

	public void addition() //non-static method
	{
		//we can call static as well as non-static variables in non-static method
		int sum1=a+b; // non-static variable
		int sum2=c+d; //static method
		System.out.println("addition is "+sum1);	
		System.out.println("addition is "+sum2);	
	
	}
	
	
	public static void sub() //static method
	{
		//we can call only static variables in static method 
		//we can't call non-static variables in static method 
		
		int sub1=c-d;  //static variables
	    System.out.println("substraction is "+sub1);	
	 
	}
	
}

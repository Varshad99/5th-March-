package globalLocalVariables;

public class GlobalLocalVariable {
	//declare static or non-static global variables
	
	int a=100;
	int b=200;
	int c=300;
	static int p=400;
	static int q=500;

	public static void main(String[] args) {
		
	add(); //static method
	
	GlobalLocalVariable a =new GlobalLocalVariable(); //non-static
    a.add1();	
    a.add2();
    
	}
	public static void add() 
	{
		int add=p+q;
		int mul=p*q;
		System.out.println("addition is "+add);
		System.out.println("multiplication is "+mul);
		
	}

	public void add1() 
	{
		int sum1=a+b;
		int sum2=b+c;
		int sum3=a+c;
		System.out.println("addition is "+sum1);
		System.out.println("addition is "+sum2);
		System.out.println("addition is "+sum3);
	}
	
	public void add2() //local non-static variables
	{
		int x=1500;
		float y=15f;
		float z=x/y;
		System.out.println("division is "+z);
	}
}

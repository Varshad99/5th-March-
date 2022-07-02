package globalLocalVariables;

public class GlobalLocalVariables2 {

	int p=20; //global non-static
	int q=30; //global non-static
	static int r=40;  //global static
	
	public static void main(String[] args) {
		// 
		GlobalLocalVariables2 gb =new GlobalLocalVariables2(); //object created
		gb.test(); //calling non-static method
		
		test1();   //calling static method
		
		System.out.println("value of p is "+gb.p);	//calling non static variables from same class
		System.out.println(gb.q);   //calling non static variables from same class
		System.out.println("value of r is "+r); //calling non static variables from same class
		
		int addition =100+gb.p; //using non static global variables from same class
		
		Sample.display1();  //calling static method from another class
		
		Sample s =new Sample(); //created object of another class
		s.display(); //calling non-static method from another class 
		
		System.out.println("value of m is "+s.m);	//non-static variable from another class
		System.out.println("value of n is "+Sample.n);	//static variable from another class
		
		int sub=100-s.m; //using non-static global variable from another class
		int mul=10*Sample.n-s.m;  //using static global variable from another class
		int sub1=Sample.n-s.m; 
		
		System.out.println("addition is "+addition);
		System.out.println("substraction is "+sub);
		System.out.println("multiplication is "+mul);
		System.out.println("substraction is "+sub1);
	}

	public void test()  //non-static method
	{
		int mul=p*q;
		System.out.println("multiplication is "+mul);	
	}
	
	public static void test1()  //static method
	{
		int sum =18+r;
		System.out.println("addition is "+sum);	
	}
}

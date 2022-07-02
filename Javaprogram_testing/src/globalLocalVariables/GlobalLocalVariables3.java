package globalLocalVariables;

public class GlobalLocalVariables3 {
	//declaring static and non-static variable
	
	int a=50;
	int b=100;
    static int p=200;
    static int q=300;

	public static void main(String[] args) {
		//for static method 
		test1(); //calling static method from same  class
		System.out.println("value of p is "+p); //calling static variable from same class
		float div=p/400;
		System.out.println("division is is "+div);
		
		Sample.display1(); ///calling static method from different class
		int sub=400-Sample.n;     // calling static variable from different class--> Classname.variable name
		System.out.println("substraction is "+sub);
	
		
		//for non-static method
		GlobalLocalVariables3 ga =new GlobalLocalVariables3();
		ga.test2();        //calling non-static method from same class
		
		System.out.println("value of b is "+ga.b); //calling non-static method from same class
	    int mul=100*ga.a;
	    System.out.println("multiplication is "+mul);
	   
	    int sum=50+p+ga.a;
        System.out.println("sum is "+sum);
	    		
		
	    Sample d=new Sample();     //created object for different method
	    d.display();        //calling non-static method from different class
	   // int add= 50+d.n;      //calling static variable from different class
	    int add1= 100+d.m;     //calling non-static variable from different class
	    int add2=200+Sample.n+d.m;  ///calling both static and non-static both variables from different class
	   // System.out.println("addition is "+add);
	    System.out.println("addition is "+add1);
	    System.out.println("addition is "+add2);
	}
	
	
	public static void test1() 
	{
	
	    int sum= p+q; ///we can't call non-static method in static class
	    System.out.println("addition  is "+sum);
	}
	
	public void test2() 
	{
	   int mul=a+b;
	   float div=a/b;
	   int sub=q-p;
	   System.out.println("multiplication is "+mul);
	   System.out.println("division is "+div);
	   System.out.println("substraction is "+sub);
		
	}

}

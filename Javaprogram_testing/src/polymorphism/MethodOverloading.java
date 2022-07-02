package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		 // declaring multiple methods with same method name with different parameters/arguments in same class 
		//it is a example of compile time --> based on arguments passed
		MethodOverloading md =new MethodOverloading();
		md.display();
		md.arithmatic();
		md.arithmatic(3500, 456.90f);
		md.arithmatic(4.56d,62, 67.78f );
		
	}
	
	public void display()
	{
		System.out.println("METHOD OVERLOADING is a example of Polymorphism");
	}
	
	public void arithmatic() //method with zero parameter
	{
		int a =20000;
		int b =45000;
		int sum = a+b+35000;
		System.out.println("Addition is "+sum);
		
	}
	public void arithmatic(int a, float b) //method with two different parameter
	{
		float sub =a-b;
		System.out.println("Substraction is "+sub);
	}
	
	public void arithmatic(double a,int b, float c) //method with three different parameter
	{
		double mult = a*b*c;
		System.out.println("Multiplication is "+mult);
	}

}

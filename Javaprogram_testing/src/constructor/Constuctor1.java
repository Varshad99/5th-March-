package constructor;

public class Constuctor1 {
	
	
	public static void main(String[] args)
	{
		// default constructor
		
		Constuctor1 c1=new Constuctor1();
		c1.display();
		}
	
	public void display()//non-static method without parameter
	{ 
		
		System.out.println("Welcome to constructor");
	}

}

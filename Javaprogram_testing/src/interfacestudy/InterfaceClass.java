package interfacestudy;

public class InterfaceClass implements MyInterface {

	public static void main(String[] args) {
		
		
		System.out.println(a); //calling variable of interface 
		
		InterfaceClass ic= new InterfaceClass();
		ic.m1();
		ic.m2();
		ic.display(); //own method of implementation class
	
	}

	@Override
	public void m1()
	{
		System.out.println("I am m1 incomplete method from MyInterface and completed in InterfaceClass using implements keyword");
		
	}

	@Override
	public void m2() 
	{
		System.out.println("I am m2 incomplete method from MyInterface and completed in InterfaceClass using implements keyword");
		
		
	}

	public void display()
	{
		
		System.out.println("I am complete method from same means InterfaceClass");
	}
}

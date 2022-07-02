package accessmodifier;

public class DefaultMethod {
	
	int a =10;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// we can call same class and also accessible within package
		DefaultMethod dm = new DefaultMethod();
		dm.display();
		
		System.out.println(dm.a);
		
	}

	void display()
	{
		System.out.println("this is default method");
	}
}

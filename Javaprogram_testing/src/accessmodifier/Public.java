package accessmodifier;

public class Public {

	public int a=100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//we can create object for public method 
		//public method accessible within project
		Public p =new Public();
		p.display1();
		
		System.out.println(p.a);
		
	}
	
	public void display1()
	{
		System.out.println("this is public access modifier"); 
	}

}

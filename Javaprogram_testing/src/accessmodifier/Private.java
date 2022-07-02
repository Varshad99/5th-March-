package accessmodifier;

public class Private {

	private int a=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// this method calling only same class ===>we can't call from another class
			Private p =new Private();
			p.display();
			
			System.out.println(p.a);

	}

	private void display()
	{
		System.out.println("this is private class");
	}
}

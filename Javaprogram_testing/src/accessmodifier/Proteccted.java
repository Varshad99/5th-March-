package accessmodifier;

public class Proteccted {

	protected int n=50;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//this method accessible within package--->also another package using inheritance
		 	Proteccted pd =new Proteccted();
		    pd.display2();
		    
		    System.out.println(pd.n);
	}
	
	protected void display2()
	{
		System.out.println("this method is protected ");		
	}

}

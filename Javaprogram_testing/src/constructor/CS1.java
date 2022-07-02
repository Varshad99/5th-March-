package constructor;

public class CS1 {
	
	int a;
	int b;
	
	public CS1()
	{
		a=10;
		b=20;
	}
	
	public void sum()
	{
		int sum=a+b;
		System.out.println("sum is "+sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CS1 s = new CS1();
		s.sum();
	}

}

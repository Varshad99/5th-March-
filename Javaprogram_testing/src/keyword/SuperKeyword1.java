package keyword;

public class SuperKeyword1 extends SuperKeyword {
	
	int b=200;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperKeyword1 sk = new SuperKeyword1();
		sk.display();
		sk.sum();
		
	}

	public void display()
	{
		System.out.println(super.a);
		System.out.println(b);
	}
	 public void sum()
	 {
		 
		 int sum =super.a+this.b+100;
		 
		 System.out.println(sum);
	 }
}

package keyword;

public class ThisKeyword {
	
	int a= 100; // non-static global variable
	int b=200; //static global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword tk = new ThisKeyword();
		tk.sum();
		tk.print();
		
		
	}

	public void print()
	{
		  
		int a = 50; // local variable
		int  b= 100; //  local variable
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(b);
		
	}
	
	public void sum()
	{
		int sum =20+a+b;
		int sum1 =50+this.a+this.b;
		
		System.out.println(sum);
		System.out.println(sum1);
		
	}
}

package constructor;

public class CS2 {
	
	int a;
	int b;
	int c;
	
	 public CS2()// constructor without parameter
	{
		a=10;
		b=20;
		c=30;
	}
	
	public CS2(int x) // constructor with single parameter
	{
		 a=x;
		}
	
	public CS2(int x,int y) // constructor with two parameter
	{
		a=x;
	    b=y;
	}
	
	public CS2(int x, int y, int z) // constructor with three parameter
	{
        a=x;
		b=y;
		c=z;
	}
	
       public static void main(String[] args) {
		// TODO Auto-generated method stub

		CS2 c2 = new CS2();
		c2.sum();
		
		CS2 c3= new CS2(100);
	    c3.sum();
	    
	    CS2 c4 = new CS2(100,200);
	    c4.sum();
	    
	    CS2 c5 = new CS2(100,200,300);
	    c5.sum();
		
	}
	public void sum() {
		
		int sum= a+b+c;
		System.out.println("addition is "+sum);
		
		
	}

}

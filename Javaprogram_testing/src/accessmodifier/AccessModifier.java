package accessmodifier;

public class AccessModifier {
	
	int a=40;
	public int b =50;
	private int c=80;
	protected int d=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifier am =new AccessModifier();
		am.test1(); //default accessible within package
		am.test2(); //public  accessible within project
		am.test3(); //private accessible within class
		am.test4(); //protected accessible within package --> also anoter package within inheritance
		
		System.out.println(am.a);
		System.out.println(am.b);
		System.out.println(am.c);
		System.out.println(am.d);
	}

	void test1()
	{
		System.out.println("DEFAULT ACCESS MODIFIER");
	}
	
	public void test2()
	{
		System.out.println("PUBLIC ACCESS MODIFIER");
	}
	
	private void test3()
	{
		System.out.println("PRIVATE ACCESS MODIFIER");
	}
    protected void test4()
	{
		System.out.println("PROTECTED ACCESS MODIFIER");
	}
	
	
}

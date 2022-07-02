package finalstudy;

public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalMethod fm =new FinalMethod();
		//fm.test();
		fm.test1();
	}
	
	public final void test()
	{
		System.out.println("I am test method from FinalMethod");
	}

	final public void test1()
	{
		System.out.println("I am test1 method from FinalMethod");
	}
}

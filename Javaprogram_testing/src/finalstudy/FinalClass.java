package finalstudy;

public class FinalClass extends FinalMethod{

	public static void main(String[] args) {
		// we can't extends super class if we used final keyword before method
		
		
		FinalMethod fm =new FinalMethod();
		fm.test();
		fm.test1();
		
		FinalClass fc =new FinalClass();
		//fc.test();
		fc.test1();
		fc.test();
		
	}
	
//	public void test() //override the test method
//	{
//		System.out.println("hii i am test method from Finalclass ");
//	}

	//public void test1() //we can't override test1 method because of final keyword
	//{
	  //System.out.println("hii i am test1 method from FinalMethod ");
	//}
}

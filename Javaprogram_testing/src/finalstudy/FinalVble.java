package finalstudy;

public class FinalVble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalVble fv =new FinalVble();
		fv.number();
		fv.number1();
	}
	
	public void number()
	{
		
	int a = 20;
	a=a+20;
	System.out.println("initial value of a is "+a);
	System.out.println("updated value of a is "+a);
	}
	
	public void number1()
	{
		//int a =40;
	    final int b =50;  //final keyword is used for we want show fixed value
		System.out.println(b);
	}
	
	
}

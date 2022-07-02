package method;

public class ArithmaticOperation {

	public static void main(String[] args) {
		
		
		ArithmaticOperation p = new ArithmaticOperation();
		p.MathOperation(30, 40);
		p.MathOperation(50, 40);
		p.MathOperation(40, 60);
		p.MathOperatino1();//without parameter

	}
 
	 public void MathOperation(int a, int b) // with parameter
	 {
		 int sum=a+b;
		 int minus=a-b;
		 int mul= a*b;
		 int div= a/b;
		 System.out.println("======================******========================");
		 //System.out.println("method with parameter");
		 System.out.println("addition "+sum);
		 System.out.println("substraction "+minus);
		 System.out.println("multiplication "+mul);
		 System.out.println("division "+div);
	}
	 public void MathOperatino1() //without parameter
	 {
		 int a=20;
		 int b=35;
		 int sum=a+b;
		 int sub=a-b;
		 int mul =a*b;
		 int div =a/b;
		    System.out.println("===================**********====================");
		    System.out.println("method without parameter");
			System.out.println("addition "+sum);
			System.out.println("substratction "+sub);
			System.out.println("multiplication" +mul);
			System.out.println("division "+div);
		 
	 }
	 
}

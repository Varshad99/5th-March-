package method;

public class Withparameter {

	public static void main(String[] args) {
		// creat a object
		
		Withparameter p = new Withparameter();
		p.batchinfo("Varsha", 20, "IT", "234512345", "Nanded");
		p.batchinfo("Komal", 10, "ETC", "6739480740", "Nashik");
		p.batchinfo("Gauri", 25, "Computer", "6587994329","Mumbai");
		p.batchinfo("Rutu", 6,"IT", "5484512314", "Nagpur");
		p.MathOperation(30, 40);
		p.MathOperation(50, 40);
		p.MathOperation(40, 60);
		
	}
    
	public void batchinfo(String name, int rollnum, String branch, String mobnum, String distric) // with parameter
	{
		
		System.out.println("=======================*****=========================");
		System.out.println("My name is "+name);
		System.out.println("My rollnum is "+rollnum);
		System.out.println("My branch is "+branch);
		System.out.println("My number is "+mobnum);
		System.out.println("I am from "+ distric);
		
	}	
	 public void MathOperation(int a, int b)
	 {
		 int sum=a+b;
		 int minus=a-b;
		 int mul= a*b;
		 int div= a/b;
		 System.out.println("======================******========================");
		 System.out.println("addition "+sum);
		 System.out.println("substraction "+minus);
		 System.out.println("multiplication "+mul);
		 System.out.println("division "+div);
	}
	
}

package method;

public class Static1 {

	//public static void main(String[] args) {
		// static method call from different mwthod ---> Classname.Methodname();
		
	//}
	
		
	public static void add() { 	
		int a,b,c;
		a=10;
		b=20;
		c= a+b;
		System.out.println("addition is "+c);
	}
	public static void sub() { 	
		int a,b,c;
		a=100;
		b=80;
		c= a-b;
		System.out.println("substractio is "+c);
	}
	public static  void mul() {
		int a,b,c;
		a=50;
		b=30;
		c=a*b;
		System.out.println("multiplication is  "+c);
	}
	public static void div() {
		int a,b,c;
		a=10;
		b=100;
		c=a/b;
		System.out.println("division is "+c);
		
		
	}

}

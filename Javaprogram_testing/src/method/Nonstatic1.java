package method;

public class Nonstatic1 {

	public static void main(String[] args) {
		// non static method call from same class ---> we need object ---> Classname objectname = newClassname();
          Nonstatic1 s = new Nonstatic1();// object created ---->   
  	     s.method1();      // 	objectname.methodname();    
  	     s.myMethod3();
  	     
	    
	    // non static method call from different class
	    Nonstatic d = new Nonstatic();  // object created ---->   
	    d.method2();// objectname.methodname();
	    d.test();
	    d.marks();
	    
	    
	}

	public void method1() 
	{
		int a= 90;
		int b= 10;
		int mul=a*b;
		System.out.println(mul);
	}
		
		public void myMethod3()
		{
		
		String name2= "Software Testing";
		System.out.println("my class is "+ name2);
		
		
	}
	
}

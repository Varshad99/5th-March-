package accesssample;

import accessmodifier.AccessModifier;

public class TestClass  extends AccessModifier {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	AccessModifier am =new AccessModifier(); //creating a object from super class/another class
	am.test2(); //calling from another class --> public access modifier
	
	
	TestClass ts =new TestClass(); // creating object from sub class/same class
	ts.test4(); //protected access modifier from another class
	ts.test2(); //public access modifier from another class
	
	
	System.out.println(am.b); 
	System.out.println(ts.b);
    System.out.println(ts.d); 
	
	
	
	}
	
}
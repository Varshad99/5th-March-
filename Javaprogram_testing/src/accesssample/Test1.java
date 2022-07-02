package accesssample;

import accessmodifier.Proteccted;

public class Test1 extends Proteccted {

	public static void main(String[] args) {
		
		
		Test1 t = new Test1();//sub class creating object
		t.display2(); //we can call protected specifier another package using extends keyword
		
		System.out.println(t.n); 
		
		
	}

}

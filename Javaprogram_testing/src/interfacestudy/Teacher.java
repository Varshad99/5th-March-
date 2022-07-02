package interfacestudy;

public class Teacher implements Math,Science {
         //we can execute multiple inheritance using implement keyword in interface ---> class implements multiple interfaces
	public static void main(String[] args) {
		
		Teacher t = new Teacher(); //creating object of sub class---> acquiring all properties from two (math,science) interface
		t.algebra();
		t.geometry();
		t.biology();
		t.chemistry();
		t.physics();
		
		System.out.println(s); //calling variables from math interface
		System.out.println(s2); //calling variables from science interface

		t.questionPaper();
	}

	@Override
	public void physics() {
		
		System.out.println("this physics method from science interface");
	}

	@Override
	public void chemistry() {
		
		System.out.println("this chemistry method from science interface");
	}

	@Override
	public void biology() {
		
		System.out.println("this biology method from science interface");
	}

	@Override
	public void geometry() {
		
		System.out.println("this geometry method from math interface");
	}

	@Override
	public void algebra() {
		
		System.out.println("this algebra method from math interface");
	}

	@Override
	public void questionPaper() {
		// TODO Auto-generated method stub
		Math.super.questionPaper();
		Science.super.questionPaper();
		
	}

	
	
	
	
	}

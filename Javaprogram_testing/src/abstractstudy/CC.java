package abstractstudy;

 public class CC extends AbstractStudy {

	public static void main(String[] args) {
		// if we want to execute incomplete method then use concrete class with extends keyword
	
		CC c =new CC(); //created object of concrete class
		c.test();
		c.test1();
		
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
		System.out.println("HELLO ");
	}

	
	
}

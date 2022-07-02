package inheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Teacher t =new Teacher();
		t.teach();
		
		Sub1 s =new Sub1();
		s.Math();
		s.math2();
		
		Sub2 sb =new Sub2();
		sb.Science();
		sb.science2();
	}

}

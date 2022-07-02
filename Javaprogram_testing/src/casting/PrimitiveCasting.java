package casting;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// implicit casting--->lower data into higher data
		
		int a=5555;
		double b=a;
		System.out.println(b);
		System.out.println(a);
		
		//explicit casting----->higher data into lower data
		double x =605.40;
		int y=(int)x;
		System.out.println(y);
		System.out.println(x);

		//boolean casting--> it is considered as incompatible casting where info is already predefineinside it
	}

}

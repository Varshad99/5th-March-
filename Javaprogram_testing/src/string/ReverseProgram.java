package string;

public class ReverseProgram {

	public static void main(String[] args)
	{
		
		
		String state = "Maharashtra";
	
		StringBuilder rev = new StringBuilder(state);
		rev.reverse();
		
		String revs = rev.toString();
		System.out.println(revs);
				
		
		
	}

}

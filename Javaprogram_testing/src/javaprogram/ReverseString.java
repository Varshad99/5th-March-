package javaprogram;

public class ReverseString {

	public static void main(String[] args)
	{
		
		String org = "VARSHA";
		String rev = "";

		for (int i = org.length() - 1; i>= 0; i--) {
			rev = rev + org.charAt(i);

		}
		System.out.println("original string is " + org);
		System.out.println("reverse string is  " + rev);

	}

}

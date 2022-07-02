package controlstatement;

public class ElseIfStatement4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int age=50;
		String group="teenage";
		
		if(group=="child")
		{
			System.out.println("group of age 0 to 12");

			}
		
		else if(group=="teenage")
		{
			System.out.println("group of age 12 to 18");

			}
		
		else if(group=="adult")
		{
			System.out.println("group of age 18 to 40");

			}
		
		else if(group=="senior")
		{
			System.out.println("group of age 40 to 60");

			}
		else
		{
			System.out.println("group of age 60 to above");

		}
	}

}

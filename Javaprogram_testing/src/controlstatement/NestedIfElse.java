package controlstatement;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String UN="Velocity";
		String PWD="Velocity@2022";
		
		if(UN=="Velocity")
		{
			System.out.println("Username is correct, please enter the password");
			
			if(PWD=="Velocity@2022")
			{
				System.out.print("Login success");
				
			}
			else
			{
				System.out.print("Invalid password");
			}
		}
			else
			{
				System.out.print("please enter correct username");
			}
		

	}

}

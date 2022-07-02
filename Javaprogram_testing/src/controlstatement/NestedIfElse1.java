package controlstatement;

public class NestedIfElse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int user=20;
		String sign="signsture";
		
		if(user>=18)
		{
			System.out.println("you are eligible");
		
			 if(sign=="signature")
			{
				System.out.println("login successfuly");
			}
			
			 else
			 {
				 System.out.println("please, correct your signature");
			 }
			 
		}
		else
		 {
			 System.out.println("you are not eligible");
		 }
	}

}

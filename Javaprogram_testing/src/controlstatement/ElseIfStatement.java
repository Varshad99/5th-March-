package controlstatement;

public class ElseIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char grade='B';
		
		if(grade=='A')
		{
			
           System.out.println("mark range in 75 to 90");
		}
			
		else if(grade=='B')
		{
			System.out.println("mark ange in 60 to 75");

		}
		
		else if(grade=='C')
		{
			System.out.println("mark range in 40 to 60");

		}
		else if(grade=='D')
		{
			
			System.out.println("mark less than 40");

		}
		
		else
		{
			System.out.println("you are fail");
	
		}
		
	}

}

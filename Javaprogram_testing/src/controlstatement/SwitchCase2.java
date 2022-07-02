package controlstatement;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade='B';
		
		switch(grade)
		{
		case 'A':System.out.println("marks between 75 and above");
		break;
		
		case'B':System.out.println("marks between 60 to 74 ");
		break;
		
		case'C':System.out.println("marks between 40 to 59");
		break;
		
		case 'D':System.out.println("below 40");
		break;
		
		default:System.out.println(" FAIL "); 
		break;
		
		}
	}

}

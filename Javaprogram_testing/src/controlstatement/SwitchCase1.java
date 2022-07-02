package controlstatement;

public class SwitchCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String week ="Friday";
		
		switch(week)
		{
		case"Monday":System.out.println("1st day of week");
		break;
		
		case"Tuesday":System.out.println("2nd day of week");
		break;
		
		case"Wedensday":System.out.println("3rd day of week");
		break;
		
		case"Thursday":System.out.println("4th day of week");
		break;
		
		case"Friday":System.out.println("5th day of week");
		break;
		
		case"Saturday":System.out.println("6th day of week");
		break;
		
		case"Sunday":System.out.println("last day of week");
		break;
		
		default :System.out.println("Invalid day of week");
		break;
	
		}
		
		
	}

}

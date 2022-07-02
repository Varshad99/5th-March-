package pattern;

public class Ex13 {

	public static void main(String[] args) 
	{
		
		//row-->7 
		//star1-->1 space1-->3-->left side
		//star2-->1 space2-->3--> right side
		
		int star1=1;
		int space1=3;
		int star2=1;
		int space2=3;
		
		for(int i=1;i<=7;i++)
		{

			for(int j=1;j<=star1;j++)
			{
			    System.out.print("*");
			}
			for(int k=1;k<=space1;k++)
			{
			    System.out.print(" ");
			}
			
			for(int j=1;j<=space2;j++)
			{
			    System.out.print(" ");
			}
			for(int k=1;k<=star2;k++)
			{
			    System.out.print("*");
			}
			
			 
	   System.out.println();
	
		if(i<4)
		{
		   star1++;
		   space1--;
		   star2++;
		   space2--;
		
		}
		
		else 
		{
		   star1--;
		   space1++;
		   star2--;
		   space2++;
		}
		}

	}

}

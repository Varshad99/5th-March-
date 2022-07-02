package pattern;

public class Ex12 {

	public static void main(String[] args) 
	{
		// *
		// **
		// ***
		// ****
		// *****
		// ****
		// ***
		// **
		// *
		//row-->9 star-->1
		
		int star=1;
		
		for(int i=1;i<=9;i++)
		{
		    for(int j=1;j<=star;j++)
	     	{
		       System.out.print("*");
		    }
		
		    System.out.println();
		
	    if(i<5)
		{
		   star++;
		}
		else 
		{
		star--;
	}

}
}
}
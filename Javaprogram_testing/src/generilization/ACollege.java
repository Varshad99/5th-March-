package generilization;

public class ACollege implements University
{

	@Override
	public void egg() 
	{
		System.out.println("Engineering field is available");
		
	}

	@Override
	public void mba()
	{
		
		System.out.println("MBA field is available");
	}

	@Override
	public void bcom()
	{
		
		System.out.println("Bcom field is available");
	}
	
	public void bba()
	{
		System.out.println("BBA field is also available");
	}

}

package generilization;

public class BCollege implements University 
{

	@Override
	public void egg() {
		System.out.println("Engineering field is available");
		
	}

	@Override
	public void mba() {
		System.out.println("MBA field is available");
		
	}

	@Override
	public void bcom() {
		System.out.println("Bcom field is available");
		
	}
	
	public void bca()
	{
		System.out.println("BCA field is also available");
	}

}

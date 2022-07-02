package constructor;

public class CS3 {
	      
	String name;
	int age;
	String degree;
	//String DOB;
	
	public CS3()
	{
		name="Varsha";
		age= 23;
		degree="BE";
		//DOB= "03/05/1999";
	}

	public CS3(String x)
	{
	  x=name	;
	}
	
	public CS3(String x ,int y)
	{
		x=name;
		y=age;
		
	}
	public CS3(String x, int y, String z)
	{
		x=name;
		y=age;
		z=degree;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CS3 n = new CS3();
        n.studentinfo();
        
    
    }
	
	public void studentinfo()
	{
		System.out.println("name is "+name);
		System.out.println("age is "+age);
		System.out.println("my degree "+degree);
	}

}

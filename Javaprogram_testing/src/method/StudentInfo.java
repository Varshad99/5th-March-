package method;

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentInfo p =new StudentInfo();
		p.batchinfo("Varsha", 20, "IT", "234512345", "Nanded");
		p.batchinfo("Komal", 10, "ETC", "6739480740", "Nashik");
		p.batchinfo("Gauri", 25, "Computer", "6587994329","Mumbai");
		p.batchinfo1();

		}

	public void batchinfo(String name, int rollnum, String branch, String mobnum, String district) // with parameter
	{
		System.out.println("=======================*****=========================");
		//System.out.println("method with parameter");
		System.out.println("My name is "+name);
		System.out.println("My rollnum is "+rollnum);
		System.out.println("My branch is "+branch);
		System.out.println("My number is "+mobnum);
		System.out.println("I am from "+ district);
		
	}	
	
	public void batchinfo1() // without parameter
	{
		String name="Ragini";
		int rollnum=14;
		String branch="Civil";
		String district="Pune";
		System.out.println("===================**********====================");
		System.out.println("method without parameter");
		System.out.println("My name is "+name);
		System.out.println("My roll no is "+rollnum);
		System.out.println("branch =" +branch);
		System.out.println("I am from "+district);
	/*	System.out.println("===================**********====================");
		System.out.println("My name is "+name);
		System.out.println("My roll no is "+rollnum);
		System.out.println("branch =" +branch);
		System.out.println("I am from "+district);*/
		
		
	}
}

package constructor;

public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HRportal Varshad = new HRportal();
		Varshad.name ="VARSHA";
		Varshad.emp_id= 216548;
		Varshad.salary=24682.500f;
		Varshad.position="Tester";
		Varshad.gender='F';
		
		Varshad.emp_info();
		
		HRportal Komald =new HRportal();
		Komald.name ="KOMAL";
		Komald.emp_id=484531;
		Komald.salary=21345.44f;
		Komald.position="Tester";
		Komald.gender='f';
		
		Komald.emp_info();
		
		
		
		
	}

}

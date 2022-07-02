package datatype;

public class DataType {

	public static void main(String[] args) {
		// two types of datatype
		//primitive datatype--->memory fixed-->keyword
		
		//variables declaration
		byte rollnum ;
		short salary;
		int number;
		long mobnumber;
		float percentage;
		double number1;
		boolean result;
		char grade;
		
		//variables initialization
		rollnum=20;
		salary= 25000;
		number = 962;
		mobnumber = 5348742154l;
		percentage= 80.53f;
		number1=216842.26612131d;
		result =true;
		grade = 'c';
		
		//usage
		System.out.println(rollnum);
		System.out.println(salary);		
		System.out.println(number);
		System.out.println(mobnumber);
		System.out.println(percentage);
		System.out.println(number1);
		System.out.println(result);
		System.out.println(grade);

		//non-primitive datatype
		String name;
		name="Varsha";
		System.out.println(name);
	}

}

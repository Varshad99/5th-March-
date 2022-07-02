package string;

public class StringMethods {

	public static void main(String[] args) {
		// constant pool area
		
		String name ="VARSHA";
		String s="VARSHA";
		
		//non-constant pool area
		String name1= new String("Varsha3599");
		String name2= new String("VARSHA");
		String name3= new String("VARSHA");
		System.out.println("=============================================");
		
		//length method
		System.out.println(name.length());///only for printing
		System.out.println(name1.length());
		
		int stringLength =name.length(); //stored in reference variable for future use
		System.out.println(stringLength);
		System.out.println("=============================================");
		
		//UpperCase method
		System.out.println(s.toUpperCase()); 
		String capitalvalueofS =s.toUpperCase();//stored in reference variable for future use
		System.out.println(capitalvalueofS);
		System.out.println("=============================================");
		
		//LowerCase method 
		System.out.println(capitalvalueofS.toLowerCase());
		System.out.println(name2);
		System.out.println(name3);
		System.out.println("=============================================");
		
		//equal method 
		System.out.println(name==s); //both name and s created without using new keyword
		System.out.println(name==name2); //name having memory in constant pool area and name2 is non-constant pool area (both location are diff)
		System.out.println(name2==name3); // both are non-constant area but memory location are different
		
		
		//equal method use
		System.out.println(name.equals(s));
		boolean result =name.equals(s); //stored in reference variable for future use
		System.out.println(result);
		System.out.println("=============================================");
		
		
		System.out.println(name.equals(name2)); 
		System.out.println(name2.equals(name3)); //case sensitive
		System.out.println(name2.equalsIgnoreCase(name3)); //this ignores case sensitive and just compares content
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println("=============================================");
		
		
		//contains method
		String city="Nanded";
		System.out.println(city.contains("Nanded"));
		System.out.println(s.contains(name));
		System.out.println(s.contains("Nanded"));
		System.out.println("=============================================");
		
		
		//isEmpty method
		System.out.println(s.isEmpty());
		String m ="";
		String n=" ";
		System.out.println(n.length());
		System.out.println(n.isEmpty());
		System.out.println(n.isBlank());
	    System.out.println(m.isEmpty());
		System.out.println(m.length());
		System.out.println("=============================================");
		
		
		//charAt method
		String city1="Nanded";
		System.out.println(city1.charAt(4));
		char answer =city1.charAt(3); //stored in reference variable for future use
		System.out.println(answer);
		System.out.println("=============================================");
		
		//endsWith method
		System.out.println(city1.endsWith("nd"));
		System.out.println(city1.endsWith("ed"));
		System.out.println("=============================================");
		
		
		//startsWith method
		System.out.println(city1.startsWith("Na"));
		System.out.println(city1.startsWith("an"));
		System.out.println("=============================================");
		
		
		//subString method
		String str="I Live in Nanded";
		System.out.println(str.substring(5));
		System.out.println(str.substring(4, 11));
		System.out.println("=============================================");
		
		
		//concat method
		String a="VARSHA ";
		String b="Dhole ";
		System.out.println(a.concat(city));
		System.out.println(a.concat(b));
		System.out.println("=============================================");
		
		//index of method
		
	//	System.out.println(a.indexOf());
		//System.out.println(a.lastIndexOf());
		//System.out.println(a.lastIndexOf(3,5));
		String inf ="infinite";
		System.out.println(inf.indexOf("i"));	
		System.out.println(inf.lastIndexOf("e"));
		//System.out.println(inf.lastIndexOf("", ""));
		System.out.println("=============================================");
		
		//replace method
		String state ="Maaharashtra";
		System.out.println(state.replace('a', 'b'));
		System.out.println(state.replace("ah", "sh"));
		System.out.println("=============================================");
		
		
		//split method
		String [] output =name.split("");
		System.out.println(output[0]);
		System.out.println("=============================================");
		
		
		
	}

}

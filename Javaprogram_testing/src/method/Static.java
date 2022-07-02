package method;

public class Static {
     public static void main(String[] args) {
    	 //static method call from same class ---> methodname();
    	 Dream();
    	// Class();
    	 // static method call from another class --->Classname.methodname();
    	 Static1.add();
    	 Static1.sub();
    	 
 }		
     public static void Dream() {
		
    	 String para = "Become a Software Engineering";
		System.out.println("My dream is "+para);
   //  }	
		
     //public static void Class() {
				
	    	 String para1 = "Software Testing";
			System.out.println("My class is "+para1);
			
	}

}

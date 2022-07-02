package javaprogram;

public class WhiteSpaceCount {

	public static void main(String[] args) {
		
		//	String str="Pune";
			String str1="P u n e";//int count=0,1,2,3
			int count=0;
			
			for(int i=0;i<=str1.length()-1;i++)//0
			{
			    char space=' ';
			    char myChar = str1.charAt(i);
			
			if(myChar==space)
			{
			  count++;
			  System.out.println("Number of white spaces in given String is "+count);
			   
	     		
			}
	
			}
}
}
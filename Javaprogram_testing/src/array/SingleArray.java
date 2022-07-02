package array;

public class SingleArray {

	public static void main(String[] args)
	{
		//using char
		
		char ar[] = new char[9];
		
		ar[0]='a';
		ar[1]='b';
		ar[2]='c';
		ar[3]='d';
		
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		
		
		System.out.println("===============================================");
		
		for (int i=0; i<3; i++)
		{
			System.out.println(ar[i]);
			
		}
		
		
		System.out.println("===============================================");
		
		for(int i=0;i<=ar.length-1;i++)
		{
			
			System.out.println(ar[i]);
		}
		
		
		
	}

}

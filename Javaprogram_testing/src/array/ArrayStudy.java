package array;

public class ArrayStudy {

	public static void main(String[] args)
	{
		// array is a collection of same data type
		//array is data structure used to homogeneous collection of information
		//array declaration need to be done with capacity
		//array are not growable in nature(fix size)
		//array is nothing but an object
		//inside array index will be present ,array index starts from zero
		
		String name[]=new String [5];
		name[0]="I";
		name[1]="LIVE";
		name[2]="IN";
		name[3]="NANDED";
		name[4]="CITY";
		
		for(int i=0;i<=4;i++)
		{
			System.out.println(name[i]);
		}
		
       System.out.println("==============================================");
	   System.out.println(name[0]);
	   System.out.println(name[1]);
	   System.out.println(name[2]);
	   System.out.println(name[3]);
	   System.out.println(name[4]);
    
	}

}

package javaprogram;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args)
	{

		int n;
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			 n = sc.nextInt();
		
		if(n % 2 == 0)
		 {
			 System.out.println("given number is even "+n);
		 }
		 else
		 {
			 System.out.println("given number is odd "+n);
		 }
			 

	}

}

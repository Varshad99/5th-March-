package javaprogram;

import java.util.Scanner;

public class SwapWithoutUsingThirdNumb {

	public static void main(String[] args)
	{

		try (Scanner sc = new Scanner(System.in)) {
			int a,b;
			 
			System.out.println("enter value odf a =");
			a= sc.nextInt();
			
			System.out.println("enter value odf b =");
			b= sc.nextInt();
			
			a = a+b;
			b = a-b;
			a = a-b;
			
			System.out.println("after swapping a= " +a+ " b = "+b);
		}

	}

}

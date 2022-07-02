package javaprogram;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		try (Scanner ab = new Scanner(System.in)) {
			System.out.println("enter value of a");
			int a =ab .nextInt();
			System.out.println("enter value of b");
			int b = ab.nextInt();
			int sum=a+b;
			System.out.println("Addition is "+sum);
		}
	}

}

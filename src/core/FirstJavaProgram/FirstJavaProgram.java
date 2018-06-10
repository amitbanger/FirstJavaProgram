package core.FirstJavaProgram;

import java.util.Scanner;

public class FirstJavaProgram {
	
	public static void main (String args []) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit:- ");
		int value = sc.nextInt();
		int factorial = value;
		for (int i = (value - 1); i > 1; i--) {
			factorial = factorial *i;
		}
	System.out.println("factorial of number = " +factorial);	
	}
}
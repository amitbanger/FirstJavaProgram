package core.FirstJavaProgram;
import java.util.Scanner;

public class ListEvenNumbers {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit:-");
		int value = sc.nextInt();
		System.out.println("Print Even Numbers Between 1 and " + value);
		for (int i = 1; i<= value; i++ ){
			if (i % 2 == 0 ){
			System.out.print(i + " ");	
			}
		}
	}

}

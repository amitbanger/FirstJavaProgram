package com.java.methods;

public class VariableArgsList {
	public static void displayAll(int...  test) {
		//we can use any data type like string, boolean etc.
		//Do with all data type
		for (int value : test) {
		System.out.println(value);
		}	
			System.out.println("Done");
		}
		public static void main(String[] args) {
			displayAll(100, 200, 300);
			displayAll(0, 20, 40, 60);
			displayAll();
}
}
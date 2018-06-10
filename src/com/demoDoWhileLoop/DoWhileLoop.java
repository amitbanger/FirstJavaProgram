package com.demoDoWhileLoop;

public class DoWhileLoop {
    /******************************WhileLoop***************************/
	public static void main(String[] args) {
		int i = 0;
		while (i<=10) {
			System.out.println("Line "+ i);
			++i;
		}
	/****************************DoWhileLoop**************************/
		do {
			System.out.println(i + "is the value of variable");
			i=i+1;
		}while(i<10);
		
	}
}
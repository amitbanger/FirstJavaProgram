package com.demo.switchstatement;

public class SwitchStatement {
	public static void main(String[] args) {
		for (int i = 0; i <=2; i++)
		//Switch on number - added in java 1.7
		switch(i=1) {
		case 1: {
			System.out.println("One:  " + i);
			break;
		}
		case 2:
		case 3: {
			System.out.println("Two or three:  " + i);
			break;
		}
		default: {
			System.out.println("default case:  " + i);
		}
		}
	}
}

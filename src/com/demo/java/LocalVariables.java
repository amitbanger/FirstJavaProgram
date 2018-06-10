package com.demo.java;

public class LocalVariables {
	public void Salary (int salesbonus) {
		int CurrentMonthbonus=salesbonus;
		int sal = 2000;
		sal = sal + CurrentMonthbonus;
		System.out.println("Monthly Salary:" + sal);
	}
     public static void main(String[] args) {
		LocalVariables m = new LocalVariables();
		m.Salary(0);
	}
  
}

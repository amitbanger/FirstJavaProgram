package com.java.methods;

public class ReturnMethods {
	static String name;
	static int monthlysalary;
	static String getEmpName() {
		return name = "Augusta";
	}
	static int getSalaryDetails() {
		return monthlysalary = 350000;
	}
	static boolean getJobStatus() {
		return false;
	}
	public static void main(String[] args) {
		if(getJobStatus()) {
			name = getEmpName();
			monthlysalary=getSalaryDetails();
			System.out.println("Emp name is:" +name);
			System.out.println("Emp salary is:" +monthlysalary);
		}else {
			System.out.println("The Employee Mr." + getEmpName()+ "is no more associated with the company");
		}
	}
}

package com.java.methods;

public class ImplementationClass {
	public static void main(String[] args) {
		//ProtectedMethod p1 = new ProtectedMethod();
		//p1.userNameDisplay();
		//PrivateMethod pri = new PrivateMethod();
		//pri.apply();
	    //String en = ReturnMethods.getEmpName() + " Banger";
	    //int sal = ReturnMethods.getSalaryDetails() + 350000;
	    //System.out.println(sal);
	    //System.out.println(en);
		int totallength = StaticMethod.totalLength("Amit", "banger");
		int average = StaticMethod.averageLenght("amit", "banger");
		System.out.println(totallength);
		System.out.println(average);
		
		VariableArgsList v1 = new VariableArgsList();
	    v1.displayAll(12);
	}
}
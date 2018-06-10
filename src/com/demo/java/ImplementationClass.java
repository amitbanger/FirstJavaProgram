package com.demo.java;

import com.java.methods.InstanceMethod;
import com.java.methods.StaticMethod;

public class ImplementationClass {
	String name = "amit";
	int rollno = 343;
	
	public static void main(String[] args) {
		StaticVariables b1 = new StaticVariables(343, "amit");
		String cn = StaticVariables.college +" Mumbai";
		b1.display(cn);
		LocalVariables l1 = new LocalVariables();
		l1.Salary(5000);
		InstanceMethod i1 = new InstanceMethod();
		int m = i1.size();
		System.out.println("" + m);
		int ttl = StaticMethod.totalLength("amit", "banger");
		int avg = StaticMethod.averageLenght("amit", "banger");
		System.out.println(ttl);
		System.out.println(avg);
	}
}
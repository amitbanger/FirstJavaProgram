package com.demo.java;

public class InstanceVariables {
	public String name;
	private int marks;
	public InstanceVariables(String Studname)
	{
		this.name = Studname;
	}
	
	public void SetMarks (int StudMarks) {
		marks = StudMarks;
	}
public void printStud(){
	System.out.println("StudentName:" +name);
	System.out.println("Marks:" +marks);
	}
public static void main (String[] args) {
	InstanceVariables st = new InstanceVariables ("Amit");
	st.SetMarks(86);
	st.printStud();
}
}
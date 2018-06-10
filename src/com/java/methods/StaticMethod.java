package com.java.methods;

public class StaticMethod {
public static int totalLength(String a, String b) {
	return a.length() + b.length();
}
public static int averageLenght(String a, String b) {
	return totalLength (a, b) / 2;
	}
public static void main(String[] args) {
	int total = totalLength("Golden", "Bowl");
	int average = averageLenght("Golden", "Bowl");
	System.out.println(total);
	System.out.println(average);
	
}
}

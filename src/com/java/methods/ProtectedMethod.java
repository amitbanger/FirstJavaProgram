package com.java.methods;

public class ProtectedMethod {

	 protected void userNameDisplay() {
		 System.out.println("Mr. peter user name is peter@m");	 
	 }
	  private void PasswordDisplay() {
		 System.out.println("Mr. peter password is A@123456");
	 }
	 public static void main(String[] args) {
		ProtectedMethod proMethod = new ProtectedMethod();
		proMethod.userNameDisplay();
		proMethod.PasswordDisplay();
	}
}

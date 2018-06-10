package com.java.methods;

public class PrivateMethod {
	public void apply() {
		System.out.println("Apply called");
		this.validate();
}
	private void validate() {
		System.out.println("Validate Class");
	}
}

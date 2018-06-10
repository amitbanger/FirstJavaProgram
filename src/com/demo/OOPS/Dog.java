package com.demo.OOPS;

public class Dog extends Animal{//extends represent we have used animal class properties
	@Override
	public void makeNoise() {// this is method overriding, here we have used animal class makeNoise and printed our statement
		// TODO Auto-generated method stub
		//polymorphism - same method with different statements
		System.out.println("I can speak");
	}
}

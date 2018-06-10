package com.demo.OOPS;

public class Animal {
	public void makeNoise()//Argument
	{
		System.out.println("Some Sound");
	}	
	public void makeNoise(int i)//method overloading---by adding parameter
	//polymorphism - same class with different parameter
	{
		System.out.println("Say something");
	}
}
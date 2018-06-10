package com.demo.OOPS;

public class ImplementationClass {
	public static void main(String[] args) {
		Animal an = new Animal();
		an.makeNoise();
		an.makeNoise(5);
		Dog d = new Dog();
		d.makeNoise();
		Cat c = new Cat();
		c.makeNoise();
	}

}

package com.demo.encapsulations;

public class Implementation extends EncapsulationDemo{
	public static void main(String[] args) {
		Implementation i1 = new Implementation();
		i1.getCustomername();
		i1.getBalance("vishal");
		i1.getFDAmount();
		i1.setBalance(20000, "vishal");
		i1.setFDAmount(30000);
		getPassword();
}
}
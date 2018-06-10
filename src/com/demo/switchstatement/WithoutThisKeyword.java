package com.demo.switchstatement;

public class WithoutThisKeyword {
		int a;
		int b;
		public WithoutThisKeyword (int a, int b) {
			this.a=a;//this is a special type of keyword which removes confusion b/w local vs instance variables 
			this.b=b;
		}
		public static void main(String[] args) {
			WithoutThisKeyword obj = new WithoutThisKeyword(10, 20);
			System.out.println(obj.a);
			System.out.println(obj.b);
		}

}

package com.test.inheritance;

public class OverridingExample {
	

	public static void main(String[] args) {
		Child c = new Child();
		c.marry();

	
	class Parent{
		void marry() {
			System.out.println("Black girl");
		}
	}
	
	class Child extends Parent{
		void marry() {
			System.out.println("Red girl");
		}
	}
	}

}

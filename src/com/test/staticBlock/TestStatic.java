package com.test.staticBlock;

public class TestStatic {
	static int a;
	static {
		a=222;
	}
	static void disp() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		TestStatic.disp();

	}

}

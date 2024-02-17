package com.test.p2;

public class NPE {

	public static void main(String[] args) {
		printString(null, 3);

	}

	private static void printString(String s, int count) {
		if (s == null)
			return;
		for (int i = 0; i < count; i++) {
			System.out.println("no npe" + s.toUpperCase());
		}

	}

}

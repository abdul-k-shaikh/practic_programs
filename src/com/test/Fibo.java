package com.test;

public class Fibo {

	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3 = 0;
		for (int i = 2; i <= 10; i++) {

			n1 = n2;
			n2 = n3;
			n3 = n1 + n2;
//			System.out.println(n1+" ");
			System.out.println(n1 + " " + n2 + " " + n3);

		}
//		System.out.println(n1+" "+n2+" "+n3);

	}

//	public static String generateFibonacci()

}

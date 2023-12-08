package com.test.array;

public class maxProductMain {

	public static void main(String[] args) {
		maxProductMain mp = new maxProductMain();
		int[] arr = { 10, 20, 30, 40, 50 };
		String result = mp.maxProd(arr);
		System.out.println("max prod :" + result);

	}

	private String maxProd(int[] arr) {
		int maxProd = 0;
		String pairs = "";
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (maxProd < arr[i] * arr[j]) {
					maxProd = arr[i] * arr[j];
					pairs = Integer.toString(arr[i]) + "," + Integer.toString(arr[j]);
				}
			}
		}
		return pairs;
	}
}

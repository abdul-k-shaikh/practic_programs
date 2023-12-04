package com.test.array;

public class findMissingNumberInArrayMain {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 6 };
		int n = arr.length;
		int sum = 0;
		sum = (n + 1) * (n + 2) / 2;

		findMissingNumberInArrayMain ob = new findMissingNumberInArrayMain();

		ob.findMissingNumberInArray(sum, arr);

	}

	private void findMissingNumberInArray(int sum, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			sum = sum - arr[i];
		}
		System.out.println("Missing element is :" + sum);
	}

}

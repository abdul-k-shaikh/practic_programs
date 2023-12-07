package com.test.array;

public class SearchInArrayMain {

	public static void main(String[] args) {
		SearchInArrayMain sia = new SearchInArrayMain();
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int num = 5;
		sia.searchInArray(arr, num);
	}

	private void searchInArray(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println("Value found at index" + " " + arr[i]);
			}
		}

	}

}

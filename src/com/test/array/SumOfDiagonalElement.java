package com.test.array;

public class SumOfDiagonalElement {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3, 4 } };
		SumOfDiagonalElement sode = new SumOfDiagonalElement();
		sode.sumOfDiagonal(arr);

	}

	private void sumOfDiagonal(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j <= i; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("Sum of Diagonal elements :" + sum);

	}

}
/*Time complexity is O(n2) as there is 2 nested loops
 * 
 * 
 * */

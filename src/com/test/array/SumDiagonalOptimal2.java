package com.test.array;

public class SumDiagonalOptimal2 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3, 4 } };
		int rownum = arr.length;
		SumDiagonalOptimal2 obj = new SumDiagonalOptimal2();
		obj.sumDiagonal(rownum, arr);
	}

	private void sumDiagonal(int rownum, int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][i];
		}

		System.out.println("Sum of diagonal ele :" + sum);

	}

}

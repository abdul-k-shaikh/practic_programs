package com.test.array;

public class SumOfArray {

	public static void main(String[] args) {
		int a[] = {1,2,3};
		int sum = 0;
		
		for (int j : a) {
			sum+=j;
		}
				
		
		System.out.println(sum);
	}

}

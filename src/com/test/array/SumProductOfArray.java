package com.test.array;

public class SumProductOfArray {

	public static void main(String[] args) {
		SumProductOfArray p = new SumProductOfArray();
		int array[]= {1,3,4,5};
		p.spofArray(array);
	}
	
	void spofArray(int[] array) {
		int sum=0; 
		int product=1;
		for (int i = 0; i < array.length; i++) {
			sum+=array[i];
		}
		for (int i = 0; i < array.length; i++) {
			product*=array[i];
		}
		System.out.println(sum+", "+product);
	}

}

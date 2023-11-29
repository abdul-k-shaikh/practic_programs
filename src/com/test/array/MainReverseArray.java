package com.test.array;

import java.util.Arrays;

public class MainReverseArray {

	public static void main(String[] args) {
		MainReverseArray m = new MainReverseArray();
		int customeArray[] = {1,2,3,4,5};
		m.reverseArray(customeArray);
	}

	private void reverseArray(int[] array) {
		
	   for (int i = 0; i < array.length/2; i++) {
		   int other = array.length-i-1;
		   int temp = array[i];
		   array[i]=array[other];
		   array[other]=temp;
	}
		System.out.println(Arrays.toString(array));
	}

}

/**
 * Output: [5, 4, 3, 2, 1]
 * 
 * **/

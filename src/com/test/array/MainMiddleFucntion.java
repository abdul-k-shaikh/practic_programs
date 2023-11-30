/*Write a function called middle that takes an array and returns a new array that contains all but the first and last elements.

myArray = [1, 2, 3, 4]
middle(myArray)  # [2,3]
 * */
package com.test.array;

import java.util.Arrays;

public class MainMiddleFucntion {

	public static void main(String[] args) {
		MainMiddleFucntion m = new MainMiddleFucntion();
		int customeArray[] = {1,2,3,4,5};
		m.middle(customeArray);


	}

	private void middle(int[] array) {
		int middleArray[]= new int[array.length-2];
		for (int i = 1; i < array.length-1; i++) {
			middleArray[i-1]=array[i];
		}
		System.out.println(Arrays.toString(middleArray));
	}

}

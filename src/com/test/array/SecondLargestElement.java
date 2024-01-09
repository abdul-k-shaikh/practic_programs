package com.test.array;

public class SecondLargestElement {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,67,83};
		int res = findSecondHigest(a);
		System.out.println("secondHigest element is :" + res);
	}

	private static int findSecondHigest(int[] a) {
		int highest = Integer.MIN_VALUE;
		int secondHigest = Integer.MIN_VALUE;
		for(int i : a) {
			if(i>highest) {
				secondHigest=highest;
				highest=i;
			}
			else if (i<highest)
			{ 	secondHigest=i;
				
			}
		}
		return secondHigest;
	}

	

}

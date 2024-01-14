package com.test.hackerrank;

public class SecondLarEle {

	public static void main(String[] args) {
		int a[] = {1,2,3,6,9};
		int res = SecondLargest(a);
		System.out.println("res :" + res);

	}

	private static int SecondLargest(int[] a) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
//		for(int i =0; i<a.length; i++) {
//			if(a[i]>largest) {
//				secondLargest=largest;
//				largest = a[i];
//			}
//			else if(a[i]<largest) {
//				secondLargest=a[i];
//			}
//		}
		for(int i:a) {
			if(i>largest) {
				secondLargest=largest;
     			largest = a[i];
			}
			else if(i<largest) {
				secondLargest=i;
			}
		}
		return secondLargest;
	}

}

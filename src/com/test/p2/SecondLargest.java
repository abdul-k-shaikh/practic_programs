package com.test.p2;

public class SecondLargest {

	public static void main(String[] args) {
		int a[] = {1,3,4,5,9};
		int len = a.length;
		int res = findSecondLargestElement(a,len); 
		System.out.println(res);

	}

	private static int findSecondLargestElement(int[] a, int len) {
		int largest = Integer.MIN_VALUE;
		int SecLargest = Integer.MIN_VALUE;
		for(int i=0; i< len; i++) {
			if(a[i]>largest) {
				SecLargest = largest;
				largest = a[i];
			}
			else if(a[i]<largest) {
				SecLargest=a[i];
			}
		}
		return SecLargest;
	}

}

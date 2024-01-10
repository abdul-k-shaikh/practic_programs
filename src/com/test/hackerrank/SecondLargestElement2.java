package com.test.hackerrank;

public class SecondLargestElement2 {

	public static void main(String[] args) {
		int a[] = {1,3,2,45,67};
		int res = SecondLargest(a);
		System.out.println("2nd highest element is :"+ res);

	}

	private static int SecondLargest(int[] a) {
		int Higest = Integer.MIN_VALUE;
		int SecondHighest = Integer.MIN_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i]>Higest) {
				SecondHighest=Higest;
				Higest=i;
			}
			else if(a[i]<Higest) {
				SecondHighest = a[i];
			}
		}
		return SecondHighest;
	}

}

package com.test.revision;

public class SecondLargsetNumber {

	public static void main(String[] args) {
		int a[]= {1,4,3,9};
		int res = SecondLargestNumber(a);
		System.out.println("2nd largest ele :"+ res);

	}

	private static int SecondLargestNumber(int[] a) {
		int largest = Integer.MIN_VALUE;
		int SecondLar = Integer.MAX_VALUE;
		for(int i=0; i<a.length; i++) {
			if(a[i]>largest) {
				SecondLar = largest;
				largest = a[i];
			}
			else if(a[i]<largest){
				SecondLar = a[i];
			}
		}
		return SecondLar;
	}

}

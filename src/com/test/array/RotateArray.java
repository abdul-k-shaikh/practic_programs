package com.test.array;

public class RotateArray {

	public static void main(String[] args) {
		int ar[]= {1,2,3,4,5,6,7};
		int d=2;
		startRotating(ar, d);

	}

	private static void startRotating(int[] ar, int d) {
		int temp[]=new int[ar.length];
		int k=0;
		for(int i=2; i<ar.length; i++) {
			temp[k++]=ar[i];
		}
		for(int j=0; j<d; j++) {
			temp[k++]=ar[j];
		}
		ar=temp;
		
		System.out.println("Rotated array :");
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]);
		}
		
	}

}

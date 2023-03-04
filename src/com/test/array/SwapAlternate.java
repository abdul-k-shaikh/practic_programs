package com.test.array;

public class SwapAlternate {

	public static void main(String[] args) {
		int a[]= {1,3,2,4};
		int len = a.length;
		//System.out.println(len);
		swapNo(a);

	}

	private static void swapNo(int[] a) {
		//System.out.println(a.length);
		for(int i=0; i<(a.length-1); i=i+2) {
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		for(int i=0; i<(a.length); i++) {
			System.out.println(a[i]);
		}
		
	}

}

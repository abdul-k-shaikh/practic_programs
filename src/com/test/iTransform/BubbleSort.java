package com.test.iTransform;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int data[]={-2, 45, 0, 11, -9};
		bubbleSort(data);
		System.out.println("Sorted Array in Ascending Order:");
		System.out.println(Arrays.toString(data));

	}
	private static void bubbleSort(int[] ar) {
		
		for (int i = 0; i < ar.length-1; i++) {
			for (int j = 0; j < ar.length-1; j++) {
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	}
}

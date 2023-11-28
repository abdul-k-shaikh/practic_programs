package com.test.array;

public class MoveZerosToRight {

	public static void main(String[] args) {
		int a[]= {1,2,3,0,5,0,2};
		moveZeros(a);
		

	}

	private static void moveZeros(int[] a) {
		int len=a.length;
		int count=len;
		System.out.println(count);
		for(int i=0; i<len; i++) {
			if(a[i]!=0) {
				a[count--]=a[i];
			}
		}
		while(len>count) {
			a[count]=0;
			count--;
		}
		for(int i=0; i<len; i++) {
			System.out.println(a[i]);
		}
	}

}

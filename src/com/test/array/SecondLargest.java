package com.test.array;

public class SecondLargest {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,8};
		int len = a.length;
		int res = SecHighest(a);
		System.out.println(res);
	}

	private static int SecHighest(int[] a) {
		int len = a.length;
		int Higest = Integer.MIN_VALUE;
		int SecondHigest = Integer.MIN_VALUE;
		for(int i=0; i<len; i++) {
			if(a[i]>Higest) {
				SecondHigest = Higest;
				Higest = a[i];
			}
			else if(a[i]<Higest){
				SecondHigest=a[i];
			}
			
		}
		return SecondHigest;
	}

}

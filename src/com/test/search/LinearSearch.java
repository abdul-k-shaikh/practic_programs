package com.test.search;

public class LinearSearch {

	public static void main(String[] args) {
		int ar[] = {-11, -4, 10, 15, 17, 20, 25, 30, 35};
		boolean res1= lsForSortedArray(ar, 9, 30);
		System.out.println(res1);

	}
	
	private static boolean lsForSortedArray(int[] ar, int n, int key) {
		for(int i=0; i<n; i++) {
			if(ar[i]==key) {
				return true;
			}
		}
		return false;
	}
	

}

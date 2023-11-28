package com.test.array;

public class BinarySearchTest2 {

	public static void main(String[] args) {
		int ar[]= {12,2,3,4,5,9,80};
		int ele =5;
		int res = startBinarySearch(ar, ele);
		System.out.println("Searched element at index "+ res);

	}

	private static int startBinarySearch(int[] ar, int ele) {
		int start = 0;
		int end = ar.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			if(ele==ar[mid]) {
				return mid;
			}
			else if(ele<ar[mid]){
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		
		return 0;
	}

}

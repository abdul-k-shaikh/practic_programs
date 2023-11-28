package com.test.array;

public class BinarysearchTest {

	public static void main(String[] args) {
		int ar[] = {-11, -4, 10, 15, 17, 20, 25, 30, 35};
		int res =  biSearch(ar);
		System.out.println("searched element is at index "+ res);
	}

	private static int biSearch(int[] ar) {
		//int ar[] = {-11, -4, 10, 15, 17, 20, 25, 30, 35};
		int ele=15;
		int start =0;
		int end = ar.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(ele==ar[mid]) {
//				System.out.println(ele);
				return mid;
			}
			else if(ele<ar[mid]) {
				end=mid-1;
			}
			else {
				start = mid+1;
			}
			///return -1;
		}
		return -1;
		//return 0;
	}

	

}

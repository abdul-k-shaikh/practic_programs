package com.test.array;

public class ArrayEquilibrium {
	public static void main(String[] args) {
		int arr[]= {-7,1,5,2,-4,3,0};
		int len=arr.length;
		System.out.println(equilibrium(arr,len));
	}
	private static int equilibrium(int[] arr, int len) {
		int Lsum, Rsum;
		for(int i=0; i<len;i++) {
			Lsum=0;
			Rsum=0;
			for(int j=0; j<i; j++)
				Lsum+=arr[j];
			
			for(int j = i+1; j<len; j++)
				Rsum+=arr[j];
			if(Lsum==Rsum) 
				return i;
		}
		return -1;
	}
}

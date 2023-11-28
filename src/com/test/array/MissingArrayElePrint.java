package com.test.array;

public class MissingArrayElePrint {

	public static void main(String[] args) {
		int a[] = {1,2,4,5};
		int n = a.length;
		int sum=0;
		sum = (n+1)*(n+2)/2;
//		for(int i=1; i<n; i++) {
//			sum = (n+1)*(n+2)/2;
//			
//		}
		System.out.println("sum is "+ sum);
		//1st method
//		for(int i=0; i<n; i++) {
//			sum = sum-a[i];
//		}
		//2nd method
		for(int num:a) {
			sum = sum-num;
		}
		
		System.out.println("Missing elements is " + sum);
			

	}

}

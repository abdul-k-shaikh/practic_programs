package com.test.array;

public class TwoPointerExample {

	public static void main(String[] args) {
		int[] inputArray= {1, 1, 2, 3, 4, 6, 8, 9};
		int targetValue1=10;
		System.out.println("Does a pair with sum " + targetValue1 + " exist? " + hasPairWithSum(inputArray, targetValue1));

	}

	private static boolean hasPairWithSum(int[] ar, int target) {
		int right=0;
		int left=ar.length-1;
		while(left<right) {
			int sum=ar[left]+ar[right];
			if(sum==target) {
				return true;
			}else if(sum<target) {
				left++;
			}else {
				right--;
			}
		}
		return false;
	}

}

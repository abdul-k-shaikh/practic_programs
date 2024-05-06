package com.test.iTransform;

public class ValueToBeSearchInArray {
// NOT optimal solution 
	public static void main(String[] args) {
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int target = 10;
		
		System.out.println(searchInArray(arr, target));

	}

	private static boolean searchInArray(int[] arr, int target) {
		boolean res = false;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]==target) {
				res = true;
				break;
			}
			else
				 res=false;
		}
		return res;
	}

	

}

package com.test.leetcode;

public class SearchInsert35 {

	public static void main(String[] args) {
		int nums[] = {1,3,5,6,9};
		int target=4;
		System.out.println(searchInsert(nums,target));
		
	}

	private static int searchInsert(int[] nums, int target) {
		int low = 0;
		int high=nums.length-1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]>target) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
			
		}
		return low;
				
	}

}

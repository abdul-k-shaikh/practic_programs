package com.test.leetcode;

public class RemoveElementsL27 {

	public static void main(String[] args) {
		int nums[]= {3,2,2,3};
		int val =2;
		System.out.println(removeElement(nums,val));

	}

	private static int removeElement(int[] nums, int val) {
		int count=0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=val) {
				nums[count]=nums[i];
				count++;
			}
			
		}
		return count;
		
		
	}

}

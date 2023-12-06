package com.test.array;
//Two Sum - LeetCode 1

public class TwoSumMain {

	public static void main(String[] args) {
		int [] nums = {2,7,11,15};
		int target = 9;
		TwoSumMain tsm = new TwoSumMain();
		tsm.targetTwoSum(nums, target);

	}

	private void targetTwoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					System.out.println("sum of the elements at indexes are "+ i+" "+ j);
				}
			}
			
		}
		
	}

}

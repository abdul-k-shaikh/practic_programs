package com.test.array;

import java.util.HashSet;

public class TargetFinder {
	
	public static boolean findNumber(int[] arr, int targetNumber) {
		HashSet<Integer>processedNumbers = new HashSet<>(); 
		
		for (int i = 0; i < arr.length; i++) {
			int requiredNumber = targetNumber-arr[i];
			if(processedNumbers.contains(requiredNumber)) {
				System.out.println(requiredNumber);
				System.out.println(arr[i]);
				return true;
			}else {
				processedNumbers.add(arr[i]);
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		System.out.println(TargetFinder.findNumber(new int[] {2,12,28,14,15}, 40));
//20, 30, 10,20,50
	}

}

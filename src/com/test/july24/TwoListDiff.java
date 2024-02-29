package com.test.july24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoListDiff {

	public static void main(String[] args) {
		/*
		 * Make 2 lists a=[1,2,3,4] b=[9,8,5,5,2,3,3,4,1,1,10,9,2,3,4,10,10,9,7,7,8]
		 * Write a program to remove duplicate of b and 
		 * keep only those elements of b
		 * which are not present in a, and the final list should be shorted in ascending
		 * order. Make the same program by optimising code.
		 */
		
//		int b[] = {9,8,5,5,2,3,3,4,1,1,10,9,2,3,4,10,10,9,7,7,8};
		
		List<Integer> a = Arrays.asList(1, 2, 3, 4);
		List<Integer>b = Arrays.asList(9, 8, 5, 5, 2, 3, 3, 4, 1, 1, 10, 9, 2, 3, 4, 10, 10, 9, 7, 7, 8);
		
		List<Integer> uniqueB = b.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueB);  
		
		// Filter elements not present in list A
        uniqueB.removeAll(a);
        
        // Print the result
        System.out.println("List B after filtering: " + uniqueB);
	}

}

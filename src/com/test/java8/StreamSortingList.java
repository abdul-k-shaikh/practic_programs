package com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamSortingList {

	public static void main(String[] args) {
		List<Integer> unsorted = Arrays.asList(11, 2, 5, 3, 2, 55, 32, 34);
		List<Integer> sorted = unsorted.stream().sorted().collect(Collectors.toList());
//		System.out.println(sorted);

		
		
		
		
		
		
		
		List<Integer>unsorted1 = Arrays.asList(7,8,9,4,3,2,1);
		List<Integer> sorted1 = unsorted1.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted1);
		
		Map<Boolean, List<Integer>> collect = unsorted.stream().collect(Collectors.partitioningBy(i->1%2==0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

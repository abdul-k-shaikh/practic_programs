package com.test.july24;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDupli {

	public static void main(String[] args) {
		String str[] = { "java", "c", "cpp", "java" };
		// 1. Remove duplicates from the given array
		List<String> asList = Arrays.asList(str);
		List<String> collect = asList.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		//3. find frequency of each character in a string using Java 8 streams
		String str1 = "Abdul is working";
		Map<Character, Long> charCountMap = str1.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Cound chars of given str:"+charCountMap);
		
		//2.Given list of integers separate odd n even 
//		int a[] = {1,2,3,4,5,6,7,8,};
//		List<Integer> asList2 = Arrays.asList(a);
//		asList2.stream().collect(Collectors.partitioningBy(a->a%2==0));
		
		
		
		

	}

}

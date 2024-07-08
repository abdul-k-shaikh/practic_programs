package com.test.july24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TestMCQ {

	public static void main(String[] args) {
//		int Integer = 24;
//		char String  = 'I';
//		System.out.print(Integer);
//		System.out.print(String);

		// Sum of first 10 natural nuber
		int sum = IntStream.range(1, 5).sum();
		System.out.println("sum is " + sum);
		
		//Common elements bw 2 arrays
		List<Integer> list1 = Arrays.asList(1,3,5,6);
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		list1.stream().filter(list2::contains).forEach(System.out::println);

	}

}

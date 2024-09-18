package com.test.sep24;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveTriplet {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 3, 3, 4, 5, 6 };
		Map<Integer, Long> collect = Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		int res[] = new int[a.length-1];
		int j = 0;
		for (Map.Entry<Integer, Long> ele : collect.entrySet()) {
			if (ele.getValue() >= 2) {
				res[j++] = ele.getKey();
				res[j++] = ele.getKey();
			} else {
				res[j++] = ele.getKey();
			}
		}
		System.out.println(Arrays.toString(res));
	}

}

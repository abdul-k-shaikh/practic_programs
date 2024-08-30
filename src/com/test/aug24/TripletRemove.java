package com.test.aug24;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TripletRemove {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 4, 4, 5, 6, 7, 8 };
//		Map<Integer, Integer> mp = new LinkedHashMap<>();
		Map<Integer, Long> collect = Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		int b[] = new int[a.length - 1];
		int j = 0;
		for (Map.Entry<Integer, Long> e : collect.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());
			if (e.getValue() >= 2) {
				b[j++] = e.getKey();
				b[j++] = e.getKey();
			} else {
				b[j++] = e.getKey();
			}
		}
		System.out.println(Arrays.toString(b));

	}

}

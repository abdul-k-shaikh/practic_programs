package com.test.aug24;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveTripletElemeneFromArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 8 };
		Map<Integer, Long> occurrencesMap = Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		int res[] = new int[a.length];
		int j = 0;
		for (Map.Entry<Integer, Long> e : occurrencesMap.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());

			if (e.getValue() >= 2) {
				res[j++] = e.getKey();
				res[j++] = e.getKey();
			} else {
				res[j++] = e.getKey();
			}
		}
		System.out.println(Arrays.toString(res));
	}
}

package com.test.aug24;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveTripletDuplicate {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 4, 4, 5, 5, 6, 6, 8};
		Map<Integer, Long> elementOccurrence = Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("elementOccurrence" + elementOccurrence);

		int res[] = new int[a.length-1];
		int j = 0;
		for (Map.Entry<Integer, Long> e1 : elementOccurrence.entrySet()) {
			System.out.println(e1.getKey() + ":" + e1.getValue());
			if (e1.getValue() >= 2) {
				res[j++] = e1.getKey();
				res[j++] = e1.getKey();
			} else {
				res[j++] = e1.getKey();
			}
		}
		System.out.println(Arrays.toString(res));
	}

}

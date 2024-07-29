package com.test.july24;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 3, 3, 5, 6, 6);

		List<Integer> collect = a.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
		Map<String, Long> stationeryCountMap = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(stationeryCountMap);
	}

}

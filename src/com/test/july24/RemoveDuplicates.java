package com.test.july24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1, 3, 3, 5, 6, 6);

		List<Integer> collect = a.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		// frequency of each element in an array or a list?
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
//		Map<String, Long> stationeryCountMap = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(stationeryCountMap);
		
		//P1
		Map<String, Long> collect2 = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("frq"+ collect2);
		
		String inputString = "Java Concept Of The Day";
		Map<Character, Long> charCountMap = inputString.chars().mapToObj(c->(char)c)
						.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("charCountMap"+ charCountMap);
		
		
		//sort the given list of decimals in reverse order
		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		System.out.println("DESC sorting");
		decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
		//given list of integers, print the numbers which are multiples of 5?
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		System.out.println("multiples of 5");
		listOfIntegers.stream().filter(n->n%5==0).forEach(System.out::println);
		
		//find maximum and minimum of those numbers
		List<Integer> listOfIntegers1 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		Integer maxInteger = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
		System.out.println("max integer "+maxInteger);
		
		Integer minInteger = listOfIntegers1.stream().min(Comparator.naturalOrder()).get();
		System.out.println("min integer "+ minInteger);
		
		


		
	}

}

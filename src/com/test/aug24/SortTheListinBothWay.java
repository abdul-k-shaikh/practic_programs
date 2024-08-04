package com.test.aug24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortTheListinBothWay {
	// Sort the list in reverser order
	public static void main(String[] args) {
		/*
		 * In this example, the boxed() method converts each int value in the array to
		 * an Integer, allowing you to collect them into a list.
		 */

		int a[] = { 1, 3, 5, 7, 8, 2 };

		List<Integer> ListOfInt = Arrays.stream(a).boxed().collect(Collectors.toList());

		ListOfInt.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

		// 7.From the given list of integers, print the numbers which are multiples of
		// 5?
		List<Integer> asList = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		List<Integer> multipleOf5 = asList.stream().filter(n -> n % 5 == 0).collect(Collectors.toList());
		System.out.println("multipleOf5 " + multipleOf5);

		// 8) Given a list of integers, find maximum and minimum of those numbers?
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		Integer Max_integer = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Max_integer " + Max_integer);

		Integer Min_integer = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
		System.out.println("Min_integer " + Min_integer);

		// How do you merge two unsorted arrays into single sorted array using Java 8
		// streams?

		int a1[] = new int[] { 4, 2, 7, 1 };
		int b1[] = new int[] { 4, 2, 7, 1 };
		int[] c = IntStream.concat(Arrays.stream(a1), Arrays.stream(b1)).sorted().toArray();
		System.out.println("Merging 2 arrays n sorting :" + Arrays.toString(c));

		// 10) How do you merge two unsorted arrays into single sorted array without
		// duplicates?
		int a2[] = { 4, 2, 7, 1 };
		int b2[] = { 4, 2, 7, 1 };
		int[] c2 = IntStream.concat(Arrays.stream(a2), Arrays.stream(b2)).sorted().distinct().toArray();
		System.out.println("Merging 2 arrays n sorting and displaying distinct elements :" + Arrays.toString(c2));

		//11. get three maximum numbers and three minimum numbers from the given list of
		// integers
		List<Integer> asList2 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		System.out.println("Minimum 3 Numbers");
		asList2.stream().sorted().limit(3).forEach(System.out::println);
		System.out.println("Maximum 3 Numbers");
		asList2.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		
		//Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		listOfStrings.stream().collect(Collectors.joining());
		System.out.println("listOfStrings :"+listOfStrings);
	}

}

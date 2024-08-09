package com.test.aug24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfExample {

	public static void main(String[] args) {
		/*
		 * The Stream.of() method in Java 8 is a static method used to create a stream
		 * from a specified set of values. This method is part of the
		 * java.util.stream.Stream class and can be very useful for creating streams
		 * from arrays or a sequence of elements
		 * 
		 */
		// 1. remove duplicates
		Stream<String> stringStream = Stream.of("India", "China", "Bhutan", "Nepal", "India");
		List<String> UniqueConutryName = stringStream.distinct().collect(Collectors.toList());
		System.out.println("UniqueConutryName" + UniqueConutryName);

		// 2.count of each element using Stream.of() to create stream
		Stream<String> stringStreamCountry = Stream.of("India", "China", "Bhutan", "Nepal", "India");
		Map<String, Long> FrequecnyOfEachElement = stringStreamCountry
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("FrequecnyOfEachElement" + FrequecnyOfEachElement);

		// 3.using stream.of() converting array into stream
		String[] array = { "a", "b", "c", "a" };
		Stream<String> streamFromArray = Stream.of(array);
		List<String> removedDupli = streamFromArray.distinct().collect(Collectors.toList());
		System.out.println("removedDuplictaes" + removedDupli);

		// 4. sum of all digits of a number
		int num = 1234;
		Integer sumOfDigits = Stream.of(String.valueOf(num).split(""))
				.collect(Collectors.summingInt(Integer::parseInt));
		System.out.println("sumOfDigits " + sumOfDigits);

		// 5.sum of first 10 natural number, IntStream.range(1, 11): This creates a
		// stream of integers starting from 1 (inclusive) to 11 (exclusive). So, it
		// generates the numbers 1 through 10.
		int sumOffirst10Digits = IntStream.range(1, 11).sum();
		System.out.println("sumOffirst10Digits :" + sumOffirst10Digits);
		
		//6.Second largest number in an integer array 
		int a[] = {1,11,22,33,44,55,99};
//		 OptionalInt secondLargestElement = Arrays.stream(a).boxed().sorted().skip(1).mapToInt(Integer::intValue).findFirst();
//		System.out.println("secondLargestElement "+ secondLargestElement.getAsInt());
		List<Integer> asList = Arrays.asList(1,11,22,33,44,55,99);
		Integer secondLargestElement = asList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondLargestElement);
		

	}

}

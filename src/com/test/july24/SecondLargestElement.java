package com.test.july24;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestElement {

	public static void main(String[] args) {
      int a[] = {1,4,5,8,10};
      List<int[]> numbers = Arrays.asList(a);
      numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
      
//      sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
      Optional<Integer> secondLargest = numbers.stream()
              .distinct() // Remove duplicates
              .sorted(Comparator.reverseOrder()) // Sort the stream in descending order
              .skip(1) // Skip the largest number
              .findFirst(); // Find the second largest number

     
	}

}

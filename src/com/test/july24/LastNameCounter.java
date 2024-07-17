package com.test.july24;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LastNameCounter {

	public static void main(String[] args) {
		// Given list of names
		List<String> names = Arrays.asList("Ajay Kumar", "Vimal Gupta", "Ajit Gupta", "Anand Raj");

		// Create a map to store last names and their occurrences
		Map<String, Integer> lastNameCount = new HashMap<>();

		// Iterate over each name
		for (String name : names) {
			// Split the name into first name and last name
			String[] nameParts = name.split(" ", 2);
			String lastName = nameParts[1];

			// Update the count for the last name
			lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName, 0) + 1);
		}
		// Print the result
		for (Map.Entry<String, Integer> m1 : lastNameCount.entrySet()) {
			System.out.println(m1.getKey() + ":" + m1.getValue() + " occurrences");
		}

	}

}
//output :

/*
 * Gupta:2 occurrences Kumar:1 occurrences Raj:1 occurrences
 */

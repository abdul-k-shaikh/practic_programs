package com.test.july24;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LastNameCounterTest1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ajay Kumar", "Vimal Gupta", "Ajit Gupta", "Anand Raj");
		
		//Creating the hashmap
		Map<String, Integer>lastNameCount = new HashMap<>();
		
		for(String name:names) {
			String[] nameParts = name.split(" ", 2);
			String lastName=nameParts[1];
			lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName,0)+1);
		}
		//print the result
		for(Map.Entry<String, Integer>m1:lastNameCount.entrySet()) {
			System.out.println(m1.getKey() +":"+ m1.getValue());
		}
	}

}

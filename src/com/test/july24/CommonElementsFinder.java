package com.test.july24;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CommonElementsFinder {

	public static void main(String[] args) {
		// GIVEN HASHMAP WITH ELEMENTS A,B,C
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("A", 1);
		hashMap.put("B", 2);
		hashMap.put("C", 3);

		// Given HashSet with elements B, D
		Set<String> hashSet = new HashSet<>();
		hashSet.add("B");
		hashSet.add("D");

		// Find the common elements between the HashMap and HashSet
		Set<String> commonElements = new HashSet<>(hashMap.keySet());
		commonElements.retainAll(hashSet);

		// Print the common elements
		System.out.println("Common elements: " + commonElements);

	}

}

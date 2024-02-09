package com.test.p2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapByValue {

	public static void main(String[] args) {
		
		Map<String, Integer>scores = new HashMap<>();
		scores.put("David", 90);
		scores.put("Jan", 80);
		scores.put("Mary", 87);
		scores.put("Lisa", 78);
		scores.put("Dino", 65);
		
		System.out.println(scores);
		
		scores = sortByValue(scores);
		
		System.out.println(scores);

	}

	private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
		// get the entryset
		Set<Entry<String, Integer>> entrySet = scores.entrySet();
		System.out.println("entrySet is : "+entrySet);
		
		//Create the list since the set is unordered
		List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
		System.out.println("entryList :"+ entryList);
		
		//sort the list by value
		entryList.sort((x,y)->x.getValue().compareTo(y.getValue()));
		System.out.println("Sorted list by value:"+entryList);
		
		//populate the new hasmap
		Map<String, Integer>sortedValue = new LinkedHashMap<>();
		
		for(Entry<String, Integer> e : entryList) {
			sortedValue.put(e.getKey(), e.getValue());
		}
		
		return sortedValue;
	}

}

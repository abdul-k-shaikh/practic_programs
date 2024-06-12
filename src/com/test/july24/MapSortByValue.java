package com.test.july24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSortByValue {
//Sort the hashmap by values
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("Z",1);
		map.put("C",6);
		map.put("E",8);
		System.out.println("Befor sorting" + map);
		LinkedHashMap<String,Integer> SortedMapByValue = map.entrySet().stream().sorted((e1, e2) -> {
			return e2.getValue()-e1.getValue();
		}).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println("after sorting"+SortedMapByValue);
	}

}

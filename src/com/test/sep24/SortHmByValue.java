package com.test.sep24;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHmByValue {

	public static void main(String[] args) {
		Map<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("a", 3);
		mp.put("b", 2);
		mp.put("c", 1);
		mp.put("e", 6);
		mp.put("f", 9);

		List<Integer> list = mp.values().stream().sorted().collect(Collectors.toList());
		System.out.println("mapValues" + list);

		for (int ele : list) {
			for (String key : mp.keySet()) {
				if (mp.get(key).equals(ele)) {
					System.out.println(key + ":" + ele);
				}
			}
		}
	}

}

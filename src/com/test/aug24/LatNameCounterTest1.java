package com.test.aug24;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LatNameCounterTest1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ajay Kumar", "Vimal Gupta", "Ajit Gupta", "Anand Raj");
		Map<String, Integer> mp = new HashMap<>();

		for (String name : names) {
			String[] partsName = name.split(" ", 2);
			String lastName = partsName[1];
			mp.put(lastName, mp.containsKey(lastName) ? mp.get(lastName) + 1 : 1);
		}
		for (Map.Entry<String, Integer> m1 : mp.entrySet()) {
			System.out.println(m1.getKey() + " " + m1.getValue());
		}

	}

}

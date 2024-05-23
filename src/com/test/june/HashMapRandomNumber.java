package com.test.june;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapRandomNumber {

	public static void main(String[] args) {
		Map<Integer, Double>mp = new HashMap<>();
		
		// Generate 10 random integer keys and 10 random double values
		Random r = new Random();
		for(int i=0; i<10; i++) {
			int key = r.nextInt(100)+1;
			double value = r.nextDouble();
			mp.put(key, value);
		}
		
		// Print the data stored in the HashMap
		for(Map.Entry<Integer,Double>m1:mp.entrySet()) {
			System.out.println(m1.getKey()+":"+m1.getValue());
		}
	}
}

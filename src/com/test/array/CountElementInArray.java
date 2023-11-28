package com.test.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountElementInArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,4};
		countFrequencyOfElement(a);

	}

	private static void countFrequencyOfElement(int[] a) {
		Map<Integer, Integer>m1 = new HashMap<>();
		for(int i =0; i<a.length; i++) {
			if(m1.containsKey(a[i])==false){
				m1.put(a[i], 1);
			}
			else {
				int oldVal = m1.get(a[i]);
				int newVal = oldVal+1;
				m1.put(a[i], newVal);
			}
				
		}
		Set<Map.Entry<Integer, Integer>>m2 = m1.entrySet();
		for(Map.Entry<Integer, Integer>re:m2) {
			System.out.println(re.getKey()+" "+re.getValue());
		}

	}

}

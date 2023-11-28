package com.test.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateElement {

	public static void main(String[] args) {
		int a[]= {1,2,3,3,4,5};
		printDuplicate(a);

	}

	private static void printDuplicate(int[] a) {
		Map<Integer, Integer>mp = new HashMap<>();
		for(int i=0; i<a.length;i++) {
			if(mp.containsKey(a[i])==false) {
				mp.put(a[i], 1);
			}
			else
			{
				int oldVal=mp.get(a[i]);
				int newVal=mp.get(a[i])+1;
				mp.put(a[i],newVal);
			}
		}
		Set<Map.Entry<Integer, Integer>>m=mp.entrySet();
		for(Map.Entry<Integer, Integer>re:m) {
			System.out.println(re.getKey()+" "+re.getValue());
		}
		
	}
	

}

package com.test.collections;

import java.util.TreeMap;

public class TreeMapDescSortingUsingComparator {
	public static void main(String[] args) {
		//This below line will give us natural order sorting
		//TreeMap<Integer, String>m = new TreeMap<>();
		//Below line give us customized sorting cos we are passing comparator object--> ()
		TreeMap<Integer, String>m = new TreeMap<>((T1,T2)->(T1>T2)?-1:(T1<T2)?1:0);
		m.put(100, "Durga");
		m.put(10, "Durga");
		m.put(101, "Durga");
		m.put(9, "Durga");
		m.put(9, "Dur");
		
		System.out.println(m);
	}
}

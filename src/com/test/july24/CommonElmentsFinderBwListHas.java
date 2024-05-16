package com.test.july24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElmentsFinderBwListHas {

	public static void main(String[] args) {
		List<String>list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		
		Set<String> set = new HashSet<>();
		set.add("B");
		set.add("E");
		
		//find the common elements
		Set<String>commonElements = new HashSet<>(list);
		System.out.println(commonElements);
		commonElements.retainAll(set);
		
		System.out.println("commonElements is"+ commonElements);
		
	}

}

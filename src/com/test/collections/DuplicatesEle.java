 package com.test.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesEle {

	public static void main(String[] args) {
		List<Integer>li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(1);
		
		System.out.println(li);
		
		Set<Integer> s1 = new HashSet<>(li);
		System.out.println("Removed duplicates using set :" +  s1);
		
 
	}

}

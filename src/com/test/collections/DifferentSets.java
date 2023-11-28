package com.test.collections;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DifferentSets {

	public static void main(String[] args) {
		Random obj = new Random();

		// HashSet<Integer> set = new HashSet<>(); random order insertion
//		LinkedHashSet<Integer> set = new LinkedHashSet<>(); // maintains the insertion order
		Set<Integer>set = new TreeSet<>(); //sorts the elements ascending order

		for (int i = 1; i <= 5; i++) {
			int num = obj.nextInt(100);
			set.add(num);
			System.out.println(num);
		}

		// .System.out.println("HashSet Elements :" + set);
//		System.out.println("LinkedHashSet elements are :" + set);
		System.out.println("TreeSet elements: "+ set);

	}

}

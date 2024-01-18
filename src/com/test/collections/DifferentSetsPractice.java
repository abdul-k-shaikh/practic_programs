package com.test.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class DifferentSetsPractice {

	public static void main(String[] args) {
		Random r = new Random();
		
		//Set<Integer> s = new HashSet<>(); random order insertion
		//Set<Integer> s = new LinkedHashSet<>(); maintians insertion order
		Set<Integer> s = new TreeSet<>(); //sorts the elements in ascending order
		
		for (int i = 0; i < 5; i++) {
			int num = r.nextInt(10);
			s.add(num);
		}
		System.out.println("Set element, stores in random order: "+ s);
	}

}

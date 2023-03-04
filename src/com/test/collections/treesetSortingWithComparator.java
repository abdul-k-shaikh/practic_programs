package com.test.collections;

import java.util.Set;
import java.util.TreeSet;

public class treesetSortingWithComparator {
	public static void main(String[] args) {
	  Set<Integer> s1 = new TreeSet<Integer>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
	  s1.add(10);
	  s1.add(11);
	  s1.add(9);
	  s1.add(12);
	  System.out.println(s1);
	}
}

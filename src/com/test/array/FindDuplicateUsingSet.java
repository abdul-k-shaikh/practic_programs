package com.test.array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateUsingSet {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,7};
		findDuplicate(a);

	}
	private static void findDuplicate(int[] a) {
		Set<Integer>s1= new HashSet<>();
		for(int i =0; i<a.length; i++) {
			if(s1.add(a[i])==false) {
				System.out.println(a[i]);
			}
		}
	}

	

}

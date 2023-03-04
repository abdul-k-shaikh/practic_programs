package com.test.array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,3,2};
		findDuplicate(a);
		
	}

	private static void findDuplicate(int[] a) {
		Set<Integer>s1 = new HashSet<>();
		for(int i=0; i<a.length; i++) {
			if(s1.add(a[i])==false) {
				System.out.println("Duplicate element is "+ a[i]);
				
			}
		}
		
	}

}

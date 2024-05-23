package com.test.iwM24;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int a[] = {6,7,7,8,8};
		Set<Integer>s = new HashSet<>();
		for(int i=0; i<a.length; i++) {
			if(s.add(a[i])!=false) {
				System.out.println(a[i]);
			}
		}

	}

}

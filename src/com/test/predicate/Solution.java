package com.test.predicate;

import java.util.function.Predicate;

public class Solution {
	public static void main(String[] args) {
		String names[] = {"Sunny", "Kajal", "kab", "Kat", "imo"};
		Predicate<String> startsWithK = s-> s.charAt(0)=='K';
		System.out.println("Names starts with k are");
		for(String s: names) {
			if(startsWithK.test(s)) {
				System.out.println(s);
			}
		}
	}
}

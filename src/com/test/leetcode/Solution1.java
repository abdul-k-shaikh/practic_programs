package com.test.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		String strs[] = {"flower","flow","flight"};
		
		String res = longestCommonPrefix(strs);
		System.out.println("Longest Common Prefix :"+res);
	}

	private static String longestCommonPrefix(String[] strs) {
		StringBuilder sb = new StringBuilder();
		
		//Sort the array
		Arrays.sort(strs);
		
		//get the 1st and last string
		char[] first = strs[0].toCharArray();
		char[] last = strs[strs.length-1].toCharArray();
		
		for(int i=0; i<first.length; i++) {
			if(first[i]!=last[i])
				break;
			sb.append(first[i]);
		}
		return sb.toString();
	}

}

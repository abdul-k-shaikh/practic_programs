package com.test.leetcode;

public class FindIndexOfFirstOccurrenceInString {

	public static void main(String[] args) {
		System.out.println(Strstr("leetcode","leeto"));

	}

	 static int Strstr(String haystack, String needle) {
		 for(int i=0; i<haystack.length()-needle.length()+1;i++){
			 if(haystack.charAt(i)==needle.charAt(0)) {
				 if(haystack.substring(i,needle.length()+i).endsWith(needle)) {
					 return i;
				 }
			 }
		 }
		
		return -1;
	}

}

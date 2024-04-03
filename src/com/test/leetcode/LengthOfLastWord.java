package com.test.leetcode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		 String s = "Hello World";
		 String a[] = s.split(" ");
		 int len = a.length;
//		 System.out.println(a[len-1]);
		 System.out.println(a[len-1].length());
//		 for(int i=0; i<a.length; i++) {
//			 
////			 System.out.println(s.length());
////			 System.out.println(a[i]);
//			 System.out.println(a[a.length-1].length());
//		 }
	}
}

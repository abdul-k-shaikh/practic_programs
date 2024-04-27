package com.test.leetcode;

public class ReverseVowelsOfString345 {

	public static void main(String[] args) {
		String s="anglid, a tar I tadUl gnu.";
		String result = revVowels(s);
		System.out.println("rev vowels is :" + result );
	}

	private static String revVowels(String s) {
		int start=0, end=s.length()-1;
		char c[] = s.toCharArray();
		
		while(start<end) {
			if(!isVowel(c[start])) {
				start++;
			}
			else if(!isVowel(c[end])) {
				end--;
			}
			else {
				char temp=c[end];
				c[end]=c[start];
				c[start]=temp;
				start++;
				end--;
				
			}
		}
		
		return String.valueOf(c);
	}

	private static boolean isVowel(char c) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='e'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			return true;
		}
		return false;
		
	}

	

}

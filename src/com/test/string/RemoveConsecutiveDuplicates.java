package com.test.string;

public class RemoveConsecutiveDuplicates {
	

	public static void main(String[] args) {
		//String str="aaddgghhhha";
		String str="aabb";
		//Char a[] = str.
		System.out.println(rcd(str));
	}

	private static String rcd(String str) {
		int n=str.length();
		String res="";
		for(int i=0; i<n; i++) {
			if(i<n-1 && str.charAt(i)==str.charAt(i+1)) {
				res=res+str.charAt(i);
			}
		}
		return res;
	}

	
}

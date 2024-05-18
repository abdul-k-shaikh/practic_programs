package com.test.iwM24;

import java.util.Arrays;

public class CopyIntoAnotherArray {

	public static void main(String[] args) {
		String str = "Abc Tech";
		int len = str.length();
		char[] original = str.toCharArray(); 
		char[] a = new char[len];
	
		for(int i=0; i<len;i++) {
			//logic for copying an array into another array
			a[i]=original[i];
			//Logic for reversing an array
			a[i]=original[len-i-1];
		}
		System.out.println("orginal array :"+ Arrays.toString(original));
		System.out.println("Reversed array :"+Arrays.toString(a));
	}

}

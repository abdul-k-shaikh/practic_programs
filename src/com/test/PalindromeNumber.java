package com.test;

public class PalindromeNumber {

	public static boolean main(String[] args) {
		
		int a = 22;
		
		int temp = a;
		//int n;
		int rev=0;
		while(a>0) {
			rev = rev*10;
			rev+=a%10;
			a=a/10;
		} 
//		System.out.println("rev:"+rev +" a: "+a);
		return a==rev;
       
	}
}

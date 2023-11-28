package com.test.string;

public class StringReversal {
	
	public String firstWay(String actual) {
		String reversed="";
		for(int i=actual.length(); i>0; i--) {
			//reversed=reversed+actual.charAt(i-1);
			reversed+=actual.charAt(i-1);
		}
		return reversed;
		
	}
	
	public String secondWay(String actual) {
		//String reversed ="";
		byte[] s1 = actual.getBytes();
		byte[] s2 = new byte[s1.length];
		
		//for just printing the values of bytearray
		for(int i=0; i<s1.length; i++) {
		System.out.print(s1[i]+" ");
		//byte[] s2 = new byte[s1.length];
		}
		//for reversing 
		for(int i=0; i<s1.length; i++) {
			s2[i] = s1[s1.length-i-1];
		}
		String reversed = new String(s2);
		return reversed;
	}

	public static void main(String[] args) {
		String str = "Abdul";
		StringReversal sr = new StringReversal();
		//System.out.println(sr.firstWay(str));
		System.out.println(sr.secondWay(str));
	}

}

package com.test;

public class NatureVowels {

	public static void main(String[] args) {
		String str ="nature";
		int len = str.length();
		char a[] = new char[len];
		String s2;
		
		for(int i=0; i<len; i++) {
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' || str.charAt(i)=='u') {
				a[i]=str.charAt(i);
				System.out.println("only vowels "+ a);
			}
		}
		System.out.println("only vowels"+ a.toString());
			//String s=Character.toString(a);
		    String s=String.valueOf(a);  
			System.out.println("conversion of char to string"+s);
//			String vowels ="aeiou";
//			char res=0;
//			
//				for(int k=0; k<len; k++) {
//				if(s.charAt(k)!=vowels.charAt(k)) {
//					res=vowels.charAt(k);
//					System.out.println(res);
//					
//				}
//				else
//					System.out.println("-1");
//				}	
		}


	}



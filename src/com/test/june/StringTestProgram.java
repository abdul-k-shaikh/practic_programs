package com.test.june;

public class StringTestProgram {

	public static void main(String[] args) {
		String str1 = "Hello World";
		System.out.println("length is :"+ str1.length());
		
		String str2 = "Hello";
		String str3 = "How are you?";
		
		System.out.println(str2 +" "+ str3);
		
		System.out.println(str2.concat(" ").concat(str3));
		
		//Q3
		String str4 = "Java String pool refers to collection of Strings which are stored in heap memory";
		System.out.println("in lower case "+str4.toLowerCase());
		System.out.println("in Upper case "+str4.toUpperCase());
		System.out.println("Replace all a with $ : "+ str4.replaceAll("a", "\\$"));
		System.out.println("Checking str4 containse word colletion :"+str4.contains("collection"));
		String temp = "java string pool refers to collection of strings which are stored in heap memory";
		
		System.out.println("matches the original :"+str4.equalsIgnoreCase(temp));
		
		System.out.println("__________________________StringBuffer example_______________");
		
		StringBuffer sb = new StringBuffer();
		sb.append("StringBuffer");
		sb.append(" is a peer class of String");
		sb.append(" that provides much of");
		sb.append(" the functionality of strings");
		System.out.println("Append the strings : "+sb.toString());
		
		System.out.println();
		
		String originalStr = "It is used to _ at the specified index position at the location denoted by the sign _";
		
		StringBuffer sb2 = new StringBuffer(originalStr);
		
		int underScoreIndex = originalStr.indexOf('_');
		sb2.replace(underScoreIndex, underScoreIndex+1, "insert text");
		System.out.println(sb2.toString());
	}

}

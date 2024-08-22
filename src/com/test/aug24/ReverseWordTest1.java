package com.test.aug24;

public class ReverseWordTest1 {

	public static void main(String[] args) {
		String input = "Abdul is working on java";
		String[] wordArray = input.split(" ");

		StringBuffer reversedStr = new StringBuffer();

		for (int i = wordArray.length - 1; i >= 0; i--) {
			reversedStr = reversedStr.append(wordArray[i]).append(" ");
		}
		System.out.println(reversedStr);
	}

}

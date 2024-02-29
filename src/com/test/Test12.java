package com.test;

public class Test12 {

	public static void main(String[] args) \
		String input = "ABCD";
		StringBuilder output = new StringBuilder();

		for (char c : input.toCharArray()) {
			char shiftedChar = (char) (c + 1);
			output.append(shiftedChar);
		}
		System.out.println("Input: " + input + ", Output: " + output);
	}

}

package com.test.aug24;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String inputString = "OneSpace TwoSpaces  ThreeSpaces   FourSpaces    Tab        End";
		char[] charArray = inputString.toCharArray();
		String StringWithouWhiteSpaces = " ";
		for (int i = 0; i < charArray.length; i++) {
			if ((charArray[i] != ' ') && (charArray[i] != '\t')) {
				StringWithouWhiteSpaces = StringWithouWhiteSpaces + charArray[i];
			}
		}
		System.out.println("input string :" + inputString);
		System.out.println("Input String Without Spaces :" + StringWithouWhiteSpaces);

	}

}

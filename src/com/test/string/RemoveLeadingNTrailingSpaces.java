package com.test.string;

public class RemoveLeadingNTrailingSpaces {

	public static void main(String[] args) {
		String s = "  abc  def\t";
		//strip() method is added in java 11 so for lower version of java need to use trim()
//		s=s.trim();
		s=s.replace(" ", "");
		System.out.println("After removing leading and trailing spaces :"+ s);

	}

}

package com.test.hackerrank;

import java.util.Date;

public class SimpleDateFormat {

	public static void main(String[] args) {
		
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat sml = new SimpleDateFormat(pattern);
		
		String date = sml.format(new Date());
		System.out.println(date);
	}
}

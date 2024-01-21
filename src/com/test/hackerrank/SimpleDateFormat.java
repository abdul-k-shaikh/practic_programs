package com.test.hackerrank;

import java.util.Date;

public class SimpleDateFormat {

	public static void main(String[] args) {
		
		String pattern = "mm-dd-yyyy";
		SimpleDateFormat sml = new SimpleDateFormat();
		
		String date = sml.format(new Date());
		System.out.println(date);
	}
}

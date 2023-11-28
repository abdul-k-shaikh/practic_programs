package com.test.functionFI;

import java.util.function.Function;

public class Test2 {

	public static void main(String[] args) {
		String s = "Alhamdulillha I am a aspiring java full stack developer";
		Function<String,Integer> res = s1->s1.length()-s1.replaceAll(" ", "").length();
		System.out.println(res.apply(s));
	}
}

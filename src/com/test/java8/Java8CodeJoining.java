package com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8CodeJoining {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Java", "C", "CPP","R","python");
		String joinedString = listOfStrings.stream().collect(Collectors.joining(":", "(", ")"));
		System.out.println(joinedString);

	}

}

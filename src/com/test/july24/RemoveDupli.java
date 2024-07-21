package com.test.july24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupli {

	public static void main(String[] args) {
		String str[] = {"java", "c", "cpp", "java"};
		List<String> asList = Arrays.asList(str);
		List<String> collect = asList.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
	}

}

package com.test.practice;

import java.util.ArrayList;
import java.util.List;

public class listMerge {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("1");
		List<String> list2 = new ArrayList<>();
		list2.add("2");
		
		List<String> merged = new ArrayList<>(list1);
		merged.addAll(list2);
		
		System.out.println(merged);
		

	}

}

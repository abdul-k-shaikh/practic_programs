package com.test.july24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastList {
	// Concurrent Modification Exception example
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
			list.add("e");
		}
	}
}

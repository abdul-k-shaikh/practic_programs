package com.test.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRemoveMtd {

	public static void main(String[] args) {
		ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		stringList.remove("D");
		System.out.println(stringList);

	}

}

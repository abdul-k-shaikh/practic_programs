package com.test.collections;

import java.util.ArrayList;

public class onlyOddNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(7);
		boolean res = onlyOddNumbers(al);
		System.out.println("true means list contains odd numbers :"+res);

	}

	private static boolean onlyOddNumbers(ArrayList<Integer> al) {
		System.out.println("list si al"+ al);
		for (Integer i : al) {
			System.out.println(i);
			if(i%2==0) {
				return false;
			}
		}
		
		return true;
	}

	

}

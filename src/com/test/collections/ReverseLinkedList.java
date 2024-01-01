package com.test.collections;

import java.util.LinkedList;

public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer>ll = new LinkedList<>();
		ll.add(1);
		ll.add(3);
		ll.add(6);
		
		System.out.println(ll);
		LinkedList<Integer>l2 = new LinkedList<>();
		
		ll.descendingIterator().forEachRemaining(l2::add);
		
		System.out.println("rev ll is :"+l2);
		
		

	}

}

package com.test.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestPredi {

	public static void main(String[] args) {
		String[] names= {"DDD","",null,"Ravi","","Shiva", null};
		Predicate<String>p=s->s!=null && s.length()!=0;
		ArrayList<String>list = new ArrayList<>();
		for(String s : names) {
			if(p.test(s)) {
				list.add(s);
			}
		}
		System.out.println("the list of valid names:");
		System.out.println(list);

	}

}

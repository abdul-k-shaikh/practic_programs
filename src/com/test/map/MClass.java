package com.test.map;

import java.util.HashMap;
import java.util.Map;

public class MClass {
	public static void main(String[] args) {
//		Map<Student, String>mp = new HashMap<>();
//		Student student = new Student("Tom");
//		System.out.println(student.getName());
//		mp.put(student, "India");
//		student.setName("Jack");
//		student.setName("Jackma");
//		
////		Student s = 
//		System.out.println(student.getName());
//		
//		System.out.println(mp.get(student));
		
		String s1 = "A";
		String s2 = new String("B");
		String s3 = "C";
		String s4 = "D";
		String s5 = s3 + s4;
		s2 = s1.concat(s5);
		System.out.println(s2.concat(s5));
		System.out.println(s2);
	}
}

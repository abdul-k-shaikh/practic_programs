package com.test.functionFI;

import java.util.function.Function;

public class Test1 {

	//Function<T, R> is a functional interface which has apply() method anf it 
	//where T is input type and R is return type
	//q1. removing spaces from given string 
	
	public static void main(String[] args) {
		String s = "abdul is doing good job";
		Function<String,String> f = s1->s1.replaceAll(" ","");
		System.out.println(f.apply(s));
	}
}

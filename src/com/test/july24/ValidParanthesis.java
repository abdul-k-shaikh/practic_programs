package com.test.july24;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		String s = "[({}]";
		Boolean res =  isVallid(s);
		System.out.println("res is "+res);
	}

	private static Boolean isVallid(String s) {
		Stack<Character>stack = new Stack<Character>();
		for(char c : s.toCharArray()) {
			if(c=='(') 
				stack.push(')');
			else if(c=='{')
				stack.push('}');
			else if(c=='[')
				stack.push(']');
			else if(stack.isEmpty() || stack.pop()!=c)
				return false;
		}
		return stack.isEmpty();
		
	}

	
}

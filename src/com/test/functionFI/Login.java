package com.test.functionFI;

import java.util.Scanner;
import java.util.function.Function;

public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter UserName");
		String user = sc.next();
		System.out.println("Enter pwd");
		String pwd = sc.next();
		
		Function<String, String> f1 = s->s.substring(0,5);
		Function<String, String>f2 = s->s.toLowerCase();
		
		if(f1.andThen(f2).apply(user).equals("durga") && pwd.equals("abdul")) {
			System.out.println("Valid user");
		}
		else {
			System.out.println("Invalid user");
		}
	}
}

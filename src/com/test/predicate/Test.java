package com.test.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	String username;
	String pwd;
	public User(String username, String pwd) {
		super();
		this.username = username;
		this.pwd = pwd;
	}
	
}

public class Test {

	public static void main(String[] args) {
		Predicate<User>p=u->u.username.equals("durga") && u.pwd.equals("java");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Enter a pwd");
		String pwd = sc.next();
		User user = new User(username, pwd);
		if(p.test(user)) {
			System.out.println("Valid user");
		}
		else {
			System.out.println("invalid user");
		}
				

	}

}

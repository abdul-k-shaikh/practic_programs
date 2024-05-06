package com.test.iTransform;

import java.util.Scanner;

public class LoginAttempts {

	public static void main(String[] args) {
		//Set the correct username and password
		String correctUsername="user123";
		String correctPassword="pass123";
		
		//Maximum number of login attempt
		int maxAttempt=3;
		
		Scanner sc = new Scanner(System.in);
		
		for(int attempt=1; attempt<=maxAttempt; attempt++ ) {
			System.out.println("Enter username: ");
			String username=sc.next();
			
			System.out.println("Enter password: ");
			String password = sc.next();
			
			if(username.equals(correctUsername) && password.equals(correctPassword)) {
				System.out.println("Successfully logged in");
				break;
			}else {
				System.out.println("Wrong username or password");
				if(attempt<maxAttempt) {
					System.out.println("Remaining attempt: "+(maxAttempt-attempt));
				}else {
					System.out.println("Account locked. Contact Admin.");
				}
					
			}
		}

	}

}

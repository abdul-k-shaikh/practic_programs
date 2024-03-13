package com.test.iTransform;

import java.util.Scanner;

public class ResultDeclaration {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter marks for three subjects:");
		int subject1 = scanner.nextInt();
		int subject2 = scanner.nextInt();
		int subject3 = scanner.nextInt();

		if (subject1 > 60 && subject2 > 60 && subject3 > 60) {
			System.out.println("Passed");
		} else if ((subject1 > 60 && subject2 > 60) || (subject2 > 60 && subject3 > 60)
				|| (subject1 > 60 && subject3 > 60)) {
			System.out.println("Promoted");
		} else {
			System.out.println("Failed");
		}
	}
}

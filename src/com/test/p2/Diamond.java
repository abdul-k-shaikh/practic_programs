package com.test.p2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Diamond {

	public static void main(String[] args) {
		// try-catch
		try {
			FileInputStream fis = new FileInputStream("Test.txt");
			System.out.println("no file found");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Error at file");
		}

	}

}

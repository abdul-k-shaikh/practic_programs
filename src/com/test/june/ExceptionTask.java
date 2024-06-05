package com.test.june;

public class ExceptionTask {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		if(b==0) {
			throw new UnsupportedOperationException("Error: Division by zero is not allowed.");
		}
		 try {
			int res = a/b;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} 
		 catch(UnsupportedOperationException e) {
			   System.out.println("Please enter valid no.");
		 }

	}

}

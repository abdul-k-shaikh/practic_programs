package com.test.june.exceptionExample;

public class MainTest {

	public static void main(String[] args) {
		try {
			SavingAccount savingAcc = new SavingAccount(1, 2000);
			System.out.println(savingAcc.getBalance());
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

package com.test.june.exceptionExample;

public class MainTest {

	public static void main(String[] args) {
		try {
			SavingAccount savingAcc = new SavingAccount(1, 2000);
			System.out.println("Initial balance: " +savingAcc.getBalance());
			
			// Attempt to withdraw more than balance (raises InsufficientBalanceException)
			savingAcc.withdraw(2100);
			
			// Withdrawal successful
			savingAcc.withdraw(100);
			System.out.println("Balance after withdrawal: " + savingAcc.getBalance());
			
			// Attempt to withdraw a negative value (raises IllegalBankTransactionException)
			savingAcc.withdraw(-1000);
			
		} catch (InsufficientBalanceException | IllegalBankTransactionException e) {
			System.out.println(e.getMessage());
		}

	}

}

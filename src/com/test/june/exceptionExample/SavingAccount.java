package com.test.june.exceptionExample;

public class SavingAccount {
	private long id;
	private double balance;

	public SavingAccount(long account_id, double initial_balance) {
		this.id = account_id;
		this.balance = initial_balance;

	}
	
	public double withdraw(double amount) throws InsufficientBalanceException,
	IllegalBankTransactionException
	{
		if(amount<0) {
			throw  new IllegalBankTransactionException("Withdrawal amount cannot be negative");
		}
		if(amount>this.balance) {
			throw  new InsufficientBalanceException("Insufficient balance for withdrawal");
		}
		this.balance-=amount;
		return this.balance;
		
		
	}
	public double deposit(double amount) throws IllegalBankTransactionException {
        if (amount < 0) {
            throw new IllegalBankTransactionException("Deposit amount cannot be negative");
        }
        this.balance += amount;
        return this.balance;
    }

    public double getBalance() {
        return this.balance;
    }
	
	

}

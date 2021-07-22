package com.corejava;

public class Account {
	private int acc_balance = 0;
	
	public Account(int acc_balance) {
		super();
		this.acc_balance = acc_balance;
	}
	public void withdraw(int amount ) throws WithdrawException {
		if(amount > acc_balance)
			throw new WithdrawException("Incufficient balance");
		acc_balance = acc_balance - amount;
		System.out.println("fine");
	}
	public void showBalance() {
		System.out.println(acc_balance);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account ac = new Account(25000);
		try {
		//	ac.withdraw(30000);
			ac.showBalance();
			ac.withdraw(100000);
			ac.showBalance();
		} catch (WithdrawException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	}



package com.corejava;

public class WithdrawException extends Exception {
	String msg;

	public WithdrawException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "WithdrawException [" + msg + "]";
	}
	
}

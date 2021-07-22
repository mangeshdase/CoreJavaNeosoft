package com.corejava;

public class DivideByZeroException extends Exception {
	String msg;
	public DivideByZeroException(String msg) {
		super(msg);
		this.msg = msg;
	}
	@Override
	public String toString() {
		return msg;
	}
	
	
}

package com.corejava;

public class Singleton {

	private static Singleton single_obj = null;
	
	public String str;
	
	private Singleton() {
		str = "Hi this is str of Singleton class";
	}
	
	public static Singleton getInstance() {
		if(single_obj == null) {
			single_obj = new Singleton();
			
		}
		return single_obj;
	}
}

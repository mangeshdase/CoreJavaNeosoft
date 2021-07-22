package com.corejava;

//public class ThreadTest extends Thread {
	public class ThreadTest implements Runnable{
	@Override
	public void run() {
		try {
			System.out.println("Thread "+Thread.currentThread().getId());
		}
		catch(Exception e) {
			System.out.println("Exception is caught:"+e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
		Thread t =new Thread( new ThreadTest());
		//	ThreadTest t = new ThreadTest();
			t.start();
		}

	}

}

package com.corejava;

public class SynchronizationTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Printer1.doPrint("Java");
			}
			
		}.start();
		
		new Thread() {
			public void run() {
				Printer1.doPrint("Python");
			}
		}.start();
	}

}
class Printer1{
	synchronized static void doPrint(String doc) {
		for(int i=1; i<=10; i++) {
			System.out.println("Printing "+doc +":" +i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			
				System.out.println(e.getMessage());

			}
		}
	}
}
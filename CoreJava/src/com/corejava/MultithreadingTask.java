package com.corejava;

public class MultithreadingTask{
	 String str = "Java is Nice";

	
	public static void main(String[] args) throws InterruptedException {
		String str = "Java Is Nice";
	Thread t1 = new Thread(new Thread1(str));
	t1.start();
	t1.join();
	Thread t2 = new Thread(new Thread2(str));
	t2.start();
	t2.join();
	
	}

}
class Thread1 implements Runnable {
	private String str;
	
	public Thread1(String str) {
		super();
		this.str = str;
	}

	public void run() {
		StringBuilder stb = new StringBuilder(str);
		
		try {
			Thread.sleep(4000);
			System.out.println(stb.reverse());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
class Thread2 implements Runnable{
	 
	private String str;
	
	public Thread2(String str) {
		super();
		this.str = str;
	}

	public void run() {
		String stb1 = str.replaceAll("\\s+","");
		System.out.println(stb1);
		for(int i=0;i<stb1.length();i++) {
			
			try {
				Thread.sleep(3000);
				System.out.print(stb1.charAt(i));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
		
	}
}
package com.dnb;

public class ExmplThread implements Runnable{

	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
	}
	
	public static void main(String...arg) {
		//Thread.currentThread().setName("New Name");
		
		ExmplThread test = new ExmplThread();
		Thread t = new Thread(test);
		t.run();
	}

}

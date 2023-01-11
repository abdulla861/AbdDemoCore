package com.ihs;

public class ExmThrdOddEven {
	
	int count =1;
	int num = 20;
	
	public void printOdd(){
		synchronized (this) {
			while(count < num) {
				
				while(count%2 !=0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(count);
				count++;
				notify();
			}
		}
	}

	
	public void printeven(){
		synchronized (this) {
			while(count < num) {
				while(count%2 ==0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(count);
				count++;
				notify();
			}
		}
	}
	public static void main(String[] args) {
		
		ExmThrdOddEven oeThrd = new ExmThrdOddEven();
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				oeThrd.printOdd();
			}
		});
		
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				oeThrd.printeven();
			}
		});
		
		t1.start();
		t2.start();

	}

}


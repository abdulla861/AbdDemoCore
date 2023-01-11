package com.mphasis;

public class CanStartSameThrdMutiple {
	public static void main(String...arg) {
		MyThread mt = new MyThread();
		Thread thrd = new Thread(mt);
		thrd.start();
		thrd.start();
	}

}

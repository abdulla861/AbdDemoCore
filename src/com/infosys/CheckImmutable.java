package com.infosys;

import java.util.Date;

public class CheckImmutable {

	public static void main(String[] args) {
		
		Test t1 = new Test("Abd", new Date());
		
		System.out.println(t1.toString());
		
		t1 = new Test("abc",new Date());
		
		System.out.println(t1.toString());
		
		Date d = t1.getDob();
		System.out.println(d);
		System.out.println(new Date());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d= new Date();
		System.out.println(d);

	}

}

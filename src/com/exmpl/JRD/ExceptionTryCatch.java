package com.exmpl.JRD;

public class ExceptionTryCatch {
	
	//@SuppressWarnings("finally")
	public static int val() {
		try {
			return 10/0;
		}catch(Exception e) {
			System.out.println("Hello");
			return 20;
		}finally {
			return 40;
		}
		
		//return 50; //this code is not reachable
	}
	
	public static void main(String...arg) {
		System.out.println(val());
	}

}

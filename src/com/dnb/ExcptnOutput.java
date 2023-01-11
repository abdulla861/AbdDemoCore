package com.dnb;

public class ExcptnOutput {
	
	public static void test() throws Exception {
		throw new Error();
	}
	
	public static void main(String...arg) {
		
		try {
			test();
			System.out.println("A");
		}
		catch(Throwable e){
			System.out.println("B");
		}finally {
			System.out.println("C");
		}
		
	}

}

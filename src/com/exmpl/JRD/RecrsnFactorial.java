package com.exmpl.JRD;

public class RecrsnFactorial {
	
	public static int fact(int n) {
		if( n==0 )
			return 1;
		else
			return n*fact(n-1);
		
	}
	
	public static void main(String...arg) {
		System.out.println(fact(5));
	}

}

package com.cognizant;

import java.util.Collections;

public class CheckStaticBlockEtc {
	
	static {
		System.out.println("Static block");
	}
	
	public CheckStaticBlockEtc(){
		System.out.println("Constructor");
	}
	
	static void mthd1() {
		System.out.println("static method");
	}
	
	void mthd2() {
		System.out.println("Non static method");
	}

	public static void main(String[] args) {
		
		mthd1();
		
		CheckStaticBlockEtc ck = new CheckStaticBlockEtc();
		ck.mthd2();
		

	}

}

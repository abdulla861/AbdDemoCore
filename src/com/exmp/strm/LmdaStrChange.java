package com.exmp.strm;

public class LmdaStrChange {

	public static void main(String[] args) {
		
		String val = "Member";
		
		LmdaStrChangIntrfc lmdStr = () -> {System.out.println("Hi "+val);};
		//val = "Teller"; //the variable val must be final otherwise it is throwing compile error
		lmdStr.show();
	}
}

package com.default1;

public class expString1LeftThenAllZer0 {
	
	public static void main(String...arg) {
		//6).1010101010---------------1111100000
		String s = "0001010101010";
		StringBuilder b = new StringBuilder();
		
		for(int i=0; i< s.length();i++) {
			if(s.charAt(i) == 49) {
				b.append(s.charAt(i));
			}
		}
		
		for(int j = b.toString().length()-1; j < s.length(); j++) {
			b.append("0");
		}
		System.out.println(b.toString());
		
		//alternate approach
		String s2 = "1010101010";
		StringBuilder b2  = new StringBuilder(s2.replace("0", ""));
		for(int k = b2.toString().length()-1; k < s2.length(); k++) {
			b2.append("0");
		}
		System.out.println(b2.toString());
		
	//7).my name is deepak--------my$name$is$deepak
	//8).my name is deepak-------occurence of vowels here
		
	}

}

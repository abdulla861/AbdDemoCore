package com.ihs;

public class RomanToDecimal {

	private int getDecValue(char romanChar) {

		int val = -1;

		switch (romanChar) {
		case 'i':
		case 'I':
			val = 1;
			break;
		case 'v':
		case 'V':
			val = 5;
			break;
		case 'x':
		case 'X':
			val = 10;
			break;
		case 'l':
		case 'L':
			val = 50;
			break;
		case 'c':
		case 'C':
			val = 100;
			break;
		case 'd':
		case 'D':
			val = 500;
			break;
		case 'm':
		case 'M':
			val = 1000;
			break;
		default:
			val = -1;
		}
		return val;
	}
	
	
	private int converToDec(String romanVal) {
		
		int res =0;
		
		for(int i=0; i<romanVal.length();i++) {
			int s1 = getDecValue(romanVal.charAt(i));
			
			if(i+1 <romanVal.length() && romanVal.charAt(i)!=romanVal.charAt(i+1)) {
				int s2 = getDecValue(romanVal.charAt(i+1));
				
				if(s1>s2) {
					res = res+s1;
				}
				else {
					res = res+s2-s1;
					i++;
				}
			}
			else {
				res = res+s1;
			}
		}
		
		
		return res;
	}

	public static void main(String[] args) {
		String str = "MCMIII";
		
		System.out.println(new RomanToDecimal().converToDec(str));

	}

}

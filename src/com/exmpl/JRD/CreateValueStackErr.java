package com.exmpl.JRD;

public class CreateValueStackErr {
	public static int mthd1(int n) {
		if(n==0)
			return 1;
		else
			return mthd1(n)*mthd1(n-1);
	}

	public static void main(String[] args) {
		//System.out.println(mthd1(5));
		show(5);

	}

	
	//other way
	
	public static void show(int i) {
		
		show(i);
		System.out.println("done");
		
	}
	
}

package com.exmpl.JRD;

public class DemoClass1 {
	
	public void methd1(String abc)
	{
	System.out.println("1 "+abc);
	}

	public void methd1(Object ab){
	System.out.println(ab);
	}
	
	public void methd1(int ab){
		System.out.println("int 1 "+ab);
		}
	
	public static void main(String...arg) {
		new DemoClass1().methd1(20.4f);
	}
	

}

package com.cognizant;

public abstract class CheckAbstract {
	
	CheckAbstract(){
		System.out.println("Abstract Constructor");
	}

	
	//public abstract void absMthd();
	
	public static void nonAbstractStatic() {
		System.out.println("Non abstract static");
	}
	
	
	public void nonAbstract() {
		System.out.println("Non abstract");
	}
	
	//default method are allowed only in interface
	//default void dafaultMthd() {
	//	
	//}
	
	public static void main(String...arg) {
		nonAbstractStatic();
		//CheckAbstract abs = new CheckAbstract();//instance of abstract class can't be created
	}
	
}

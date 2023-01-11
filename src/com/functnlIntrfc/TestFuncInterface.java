package com.functnlIntrfc;

@FunctionalInterface
public interface TestFuncInterface {
	
	public void show();
	
	public String toString(); // it is in object class that's why we can use these methods
	
	public  boolean equals(Object obj);

}

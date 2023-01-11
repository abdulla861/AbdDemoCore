package com.infosys;

import java.util.Date;

public final class Test {
	
	public final String name;
	public final Date dob;
	
	
	public Test(String name, Date dob) {
		this.name = name;
		this.dob = dob;
	}


	public String getName() {
		return name;
	}


	public Date getDob() {
		return dob;
	}


	@Override
	public String toString() {
		return name+" --------- "+dob.toString();
	}
	
	
	

}

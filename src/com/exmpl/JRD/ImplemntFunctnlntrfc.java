package com.exmpl.JRD;

public class ImplemntFunctnlntrfc implements CheckFunctionlIntfacCanImplement{

	@Override
	public int mthd1(int b) {
		return b*2;
	}

	
	public static void main(String...arg) {
		CheckFunctionlIntfacCanImplement chk = s -> s*5;
		
		System.out.println(chk.mthd1(2));
		
		CheckFunctionlIntfacCanImplement chk2 = new ImplemntFunctnlntrfc();
		System.out.println(chk2.mthd1(2));
	}
	
}

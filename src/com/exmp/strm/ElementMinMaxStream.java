package com.exmp.strm;

import java.util.Arrays;
import java.util.List;

public class ElementMinMaxStream {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,51,2,3,4,5);
		
		int val = values.stream().mapToInt(i->i).max().getAsInt();
		System.out.println("Max = "+val);
		
		val = values.stream().mapToInt(i->i).min().getAsInt();
		System.out.println("Min = "+val);

	}

}

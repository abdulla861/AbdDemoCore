package com.exmp.strm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStreamException1 {
	
	public static void main(String...arg) {
		List<String> list = Arrays.asList("22","44","ww","we");
		
		//List<Integer> intList = list.stream().map(Integer::parseInt).collect(Collectors.toList());
		//System.out.println(intList);
		
//		list.forEach(s->{
//			try {
//				System.out.println(Integer.parseInt(s));
//			}catch(Exception e) {
//				System.err.println("Wrong value: "+e.getMessage());
//			}
//		});
		
		
		//approach 2
		
		list.forEach(ExampleStreamException1::printList);
		
	}
	
	//approach 2
	
	public static void printList(String s) {
		try {
			System.out.println(Integer.parseInt(s));
		}catch(Exception e) {
			System.err.println("Wrong value: "+e.getMessage());
		}
	}

}

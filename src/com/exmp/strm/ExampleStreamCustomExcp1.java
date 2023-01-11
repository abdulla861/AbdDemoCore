package com.exmp.strm;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExampleStreamCustomExcp1 {
	
	public static void main(String...arg) {
		List<String> list = Arrays.asList("22","44","ww","we");
		List<Integer> list2 = Arrays.asList(1,0);
		
		//for approach 1
		//list.forEach(handleException(s->System.out.println(Integer.parseInt(s))));
		
		//approach 2
		list.forEach(handleGenericExp(s->System.out.println(Integer.parseInt(s)), NumberFormatException.class));
		list2.forEach(handleGenericExp(s->System.out.println(10/s), ArithmeticException.class));
		
		
		
		
		
	}
	
	//approach 1 - with type - work only for string type
	static Consumer<String> handleException(Consumer<String> value){
		return obj -> {
			try {
				value.accept(obj);
			}catch(Exception e) {
				System.err.println(e.getMessage());
			}
		};
	}
	
	//approach 2 - make it generic
	static <Target, ExObj extends Exception> Consumer<Target> handleGenericExp(Consumer<Target> targetConsumer, Class<ExObj> excObject){
		return obj -> {
			try {
				targetConsumer.accept(obj);
			}catch(Exception e) {
				try {
					ExObj exOb = excObject.cast(e);
					System.err.println(e.getMessage());
				}catch(ClassCastException ecx) {
					throw e;
				}
				
			}
		};
	}
	
	

}

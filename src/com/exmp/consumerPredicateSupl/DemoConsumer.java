package com.exmp.consumerPredicateSupl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoConsumer {

	public static void main(String[] args) {
		//Consumer
		
		//Consumer<Integer> consumer = t -> System.out.println("Print value = "+t);
		
		//consumer.accept(10);
		
		//other example
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		values.forEach(t -> System.out.println("Print "+ t)); // Internally it is calling the accept method of consumer functional interface

	}

	
}

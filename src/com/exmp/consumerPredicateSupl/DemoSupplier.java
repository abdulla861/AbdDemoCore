package com.exmp.consumerPredicateSupl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class DemoSupplier {

	public static void main(String[] args) {
		//Supplier
//		Supplier<String> supplier = () ->"Hello";
//		System.out.println(supplier.get());
		
		
		//other example
		List<String> values = Arrays.asList();
		
		System.out.println(values.stream().findAny().orElseGet(() -> "Not found."));

	}

}

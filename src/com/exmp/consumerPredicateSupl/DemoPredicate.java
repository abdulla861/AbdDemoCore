package com.exmp.consumerPredicateSupl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DemoPredicate {

	public static void main(String[] args) {
		
//		Predicate<Integer> predicate = t -> {
//			if(t%2 == 0)
//				return true;
//			else
//				return false;
//		};
//		
//		System.out.println(predicate.test(21));
//		
		
		//other example
		//Predicate<Integer> predicate = t -> t%2 == 0;
		//System.out.println(predicate.test(11));
		
		//other example
		List<Integer> values = Arrays.asList(1,2,3,4,51,2,3,4,5);
		//values.stream().mapToInt(v -> v).min();//for min and max value from the list
		//values.stream().mapToInt(v -> v).max();
		values.stream().filter(t->t%2 == 0).forEach(t->System.out.println("Print even: "+t));//filter internally call the test method of Predicate functional interface

	}

}


package com.exmpl.mindtree;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountInputNumFromArray {

	public static void main(String[] args) {
		int a[] = {13,17,15,15,34};
		List<Integer> list2 = Arrays.stream(a).boxed().collect(Collectors.toList());
		
		System.out.println(list2);
		
		System.out.println(list2.stream().collect(Collectors.groupingBy(a1 -> a1, Collectors.counting())));
				

	}

}

package com.emaratech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOccuranceString {

	public static void main(String[] args) {
		String[] nameArray = { "nadeem", "gyas", "abdullah", "gyas", "nadeem", "nadeem" };
		String[] nameArray2 = { "nadeem", "gyas", "abdullah"};
		
		//by java7
		getOccurance(nameArray);
		
		//java8
		System.out.println(Arrays.asList(nameArray).stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())));
		
		System.out.println(Arrays.asList(nameArray).stream().map(nm -> nm.toUpperCase()).collect(Collectors.toList()));
		
		List<List<String>> nestedList= new ArrayList<>();
		
		nestedList.add(Arrays.asList(nameArray));
		nestedList.add(Arrays.asList(nameArray2));
		
		System.out.println(nestedList.stream().flatMap(nm -> nm.stream().map(e->e.toUpperCase())).collect(Collectors.toList()));

		List<String> str = Arrays.asList(nameArray);
		Collections.sort(str);
		System.out.println(str);
		
		System.out.println(Arrays.asList(nameArray).stream().count());

	}

	// By Java7
	public static void getOccurance(String[] nameArray) {
		List<String> nameList = Arrays.asList(nameArray);

		Map<String, Integer> countStr = new HashMap<>();

		Iterator<String> itr = nameList.iterator();

		while (itr.hasNext()) {
			String value = itr.next();
			if (countStr.containsKey(value)) {
				int count = countStr.get(value);
				count++;
				countStr.put(value, count);
			} else {
				countStr.put(value, 1);
			}
		}

		System.out.println(countStr);
	}

}

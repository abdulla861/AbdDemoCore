package com.exmp.strm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountElemntDistinct {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 2, 1, 1, 3);
		
		Map<Integer, Long> freqElemnt = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		for(Map.Entry<Integer, Long> entry : freqElemnt.entrySet()) {
			System.out.println(entry.getKey()+" = "+ entry.getValue());
		}

	}

}

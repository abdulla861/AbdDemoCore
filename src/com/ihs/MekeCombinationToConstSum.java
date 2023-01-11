package com.ihs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class MekeCombinationToConstSum {

	public static void main(String[] args) {
		int numbers[] = { 30, 30, 40,35, 70, 80, 10, 20, 50,35 };

		for(int i = 0; i < numbers.length; i++) {
			findCombination(i, numbers, new ArrayList<Integer>(), 0, 370);
	    }
		
	}

	private static void findCombination(int currentIndex, int[] numbers, List<Integer> partial, int sum, int target) {

	    sum = sum + numbers[currentIndex];
	    partial.add(numbers[currentIndex]);

	    if (sum == target) {
	        System.out.println(partial);
	        return;
	    }

	   for (int i = currentIndex + 1; i < numbers.length; i++) {
		   findCombination(i, numbers, new ArrayList<>(partial), sum, target);
	    }
	}

}

package com.default1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Find4thLowest {

	public static void main(String[] args) {
//		int arr[] = {3, 9, 8, -9, -5, 3, 2, -2};
//		
//		
//		List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
//		
//		Collections.sort(arrList);
//		
//		
//		int value = 
		
		
		/*String str[] = {"WHITE", "WHITE" ,"GREEN",  "ORANGE","ORANGE", "WHITE", "GREEN", "GREEN","ORANGE","WHITE"};
		
		List<String> flagColrs = new ArrayList<>();
		List<String> colorWhite = new ArrayList<String>();
		List<String> colorGreen = new ArrayList<String>();
		List<String> colorOrange = new ArrayList<String>();
		
		int countWhite =0;
		int countGreen =0;
		int countOrange =0;
		
		
		
		
		for(int i=0;i<str.length;i++) {
			if(str[i].equals("WHITE")) {
				//colorWhite.add(str[i]);
				countWhite++;
			}
			else if(str[i].equals("ORANGE")) {
				//colorOrange.add(str[i]);
				countOrange++;
			}
			else if(str[i].equals("GREEN")) {
				//colorGreen.add(str[i]);
				countGreen++;
			}
		}*/
		
		/*flagColrs.addAll(colorOrange);
		flagColrs.addAll(colorWhite);
		flagColrs.addAll(colorGreen);
		
		System.out.print(flagColrs);*/
		
		
		
		
		int arr[] = {5, 7, -9, 0, 2, 4, 1, -8, -6};
		
		int posArr[] = new int[arr.length];
		int negArray[] = new int[arr.length];
		
		int posMove=0;
		int negMove=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>=0) {
				posArr[posMove++] = arr[i];
			}
			else
				negArray[negMove++] = arr[i];
		}

		posMove=0;
		negMove=0;
		for(int i =0 ;i<arr.length;i++) {
			
			arr[i] = posArr[posMove];
			arr[i+1] = negArray[negMove];
			
			posMove++;
			negMove++;
			i=i+2;
			
		}
		
		System.out.println(Arrays.stream(arr).boxed().collect(Collectors.toList()));
		
		
		

	}

}

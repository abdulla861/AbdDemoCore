package com.default1;
import java.util.Arrays;

public class FindMaxNum {

	public static void main(String[] args) {
		int a[] = {1,8,7};
		int valueLimit = 200;
		int maxValue = 0;
		int findIndex = 0;
		
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++) {
			if(valueLimit %100 == a[i]) {
				findIndex = i;
			}
		}
		System.out.println(findIndex); 
		
		if((a[a.length-1]*100+a[a.length-2]*10+a[a.length-3])>valueLimit) {
			maxValue = a[a.length-2]*100+a[a.length-1]*10+a[a.length-3];
		}else {
			maxValue = a[a.length-1]*100+a[a.length-2]*10+a[a.length-3];
		}
		
		System.out.println(maxValue);

	}

}

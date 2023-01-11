package com.ihs;

public class CheckPrimeJava7 {
	
	public static boolean isPrime(int n) {
		boolean flag = true;
		
		for(int i=2; i<n;i++) {
			if(n%i==0) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 20,97};
		
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				System.out.print(arr[i]+", ");
			}
		}

	}

}

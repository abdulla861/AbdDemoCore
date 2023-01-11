package com.default1;

public class MinimulPlatform {

	public static void main(String[] args) {
		int arrival [] = {900,940,950,1100, 1500,1800};
		int	departure[] = {910,1200,1120, 1130,1900,2000};
		
		int platform = 1;
		int res =1;
		int i=1,j=0;
		
		for (i =0; i < arrival.length; i++) {
			platform =1;
			
			for(j = i+1; j <arrival.length;j++) {
				
				//if(Math.max(arrival[i], arrival[j]) <= Math.min(departure[i], departure[j])) {
				//	platform++;
				//}
				
				//aproach2
				if((arrival[i] >= arrival[j] && arrival[i] <= departure[j]) || (arrival[j] >= arrival[i] && arrival[j] <= departure[i]))
					platform ++;
			}
			res = Math.max(res, platform);
		}
		
		
		System.out.println(res);

	}

}

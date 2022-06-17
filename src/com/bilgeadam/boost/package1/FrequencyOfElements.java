package com.bilgeadam.boost.package1;

import java.util.Arrays;

public class FrequencyOfElements {

	public static void main(String[] args) {
		
		int [] list = {10,30,20,10,10,30,20,20,20,40}; //aşağıda sadece birer defa yazdırmak istiyorum
		
		Arrays.sort(list);
		for(int i=0; i<list.length-1; i++) {
			int count =0;
			for(int j=0; j<list.length-1; j++) {
				if(list[i]==list[j]) {
					count++;
					
				}
			}
		if(list[i]!=list[i+1])
		
			System.out.println("Number of element "+list[i]+": " +count);
			
			
				
			}
		
	}

}

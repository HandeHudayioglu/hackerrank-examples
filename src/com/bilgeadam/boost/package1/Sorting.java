package com.bilgeadam.boost.package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		
		int [] list = {0,5,3,79,45,12};  
		int list2;
		
		for(int i=0; i<list.length; i++) {
			for(int j=i+1; j<list.length;j++) {
				if((list[i]>list[j])) {
					list2 = list[i];
					
					list[i] = list[j];
					list[j] = list2;
					
				} 
			}
		}
		
		
		System.out.println(Arrays.toString(list));
	}

}

package com.bilgeadam.boost.package1;

import java.util.ArrayList;
import java.util.Arrays;

public class WhichTwoIndexSumTarget {
	
	
	public static void main(String[] args) {
		
		int [] list1 = {1,3,4,9};
	    int target=5;
		twoSum(list1,target);
		System.out.println(Arrays.toString(twoSum(list1,target)));
		
    
	}

	public static int[] twoSum(int [] list1, int target) { //listede verilen hangi iki elamanın toplamının hedefe eşit olduğunu bulma	
		
		int [] list = new int [2];
		for(int i = 0; i<list1.length; i++) {

			for(int j = i+1; j<list1.length; j++) {
				if(list1[i]+list1[j] == target) {
					
					list[0]= list1[i];
					list[1]=list1[j];
				
				}

			}

		}
		 return list;
	} 	
	
	
	}
		


   

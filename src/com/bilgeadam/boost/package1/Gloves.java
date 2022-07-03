package com.bilgeadam.boost.package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Gloves {

	public static void main(String[] args) { // renkleri verilen eldivenlerden kaç tane çift oluşturulabilir
		
		
		String [] gloves = {"red","blue","red","blue","blue","purple"};
		Arrays.sort(gloves);
		System.out.println(Arrays.toString(gloves));
		
		
		for(int i=0; i<gloves.length-1; i++) {
			int count =0;
			for(int j=0; j<gloves.length-1; j++) {
				if(gloves[i]==gloves[j]) {
					count++;
					
				}
			}
		
			if(gloves[i]!=gloves[i+1])
				
				System.out.println("Number of element "+gloves[i]+": " +count);
				
		
//		for(int i=0; i<gloves.length; i++) {
//			for(int j=i+1; j<gloves.length;j++) {
//				if((gloves[i].equalsIgnoreCase(gloves[j]))) {
//				
//					sameColor++;
//					
//				}
//			}
//		}		System.out.println(sameColor);
	
		}
		
		
	
	
		}
}
	
	
	 

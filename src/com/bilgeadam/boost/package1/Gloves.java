package com.bilgeadam.boost.package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Gloves {

	public static void main(String[] args) { // renkleri verilen eldivenlerden kaç tane çift oluşturulabilir
		
		
		String [] gloves = {"red","blue","red","blue","blue","purple"};
		int sameColor=0;
		
		
		for(int i=0; i<gloves.length; i++) {
			for(int j=i+1; j<gloves.length;j++) {
				if((gloves[i].equalsIgnoreCase(gloves[j]))) {
					
					sameColor++;
					
				}
			}
		}
		System.out.println(sameColor++);
		
		}
		
		
		
		
		
	}
	
	
	 

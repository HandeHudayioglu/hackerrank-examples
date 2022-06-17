package com.bilgeadam.boost.package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberOfDivisors {
	
	
	

	public static void main(String[] args) { 
		
		List<Integer>list=new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		for(int k=1; k<=num; k++) {
			if(num%k==0) {
				
				list.add(k);
				
			}
			
			
		}
		
		System.out.println(list);
		}

	}



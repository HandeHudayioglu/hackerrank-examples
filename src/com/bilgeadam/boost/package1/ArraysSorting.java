package com.bilgeadam.boost.package1;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSorting {

	public static void main(String[] args) {
		
		int number; 
		
		
		
		System.out.print("Enter the size of your array:");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] array = new int [input];
		int startIndex=0;
		
		System.out.println("Enter the elements of your array:");
		for(int i=1; i<input+1; i++) {
			number = scan.nextInt();
			System.out.println(i+". element: "+number);
			array [startIndex++] = number;
			System.out.println(Arrays.toString(array));
		}
	
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		

	}

}

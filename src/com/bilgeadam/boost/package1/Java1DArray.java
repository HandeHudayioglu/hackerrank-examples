package com.bilgeadam.boost.package1;

import java.util.Arrays;
import java.util.Scanner;

public class Java1DArray {

	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	int number = scan.nextInt();
	int [] list = new int[number];
	
	for(int i=0; i<number; i++) {
		list[i]=scan.nextInt();
		
	}
	scan.close();
	
	
	for(int j=0; j<number; j++) {
		

		System.out.println(list[j]);
	}
	
	
		
  
	

}
}
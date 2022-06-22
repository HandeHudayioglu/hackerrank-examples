package com.bilgeadam.boost.package1;

import java.util.Arrays;
import java.util.Scanner;

public class SieveofEratosthenes {

	public static void main(String[] args) {
		
		
		SieveofEratosthenes soe=new SieveofEratosthenes();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive number:");
		int input = scan.nextInt();
		soe.countNumberofPrimesUpTo(input);
		
		
	}
	
	void countNumberofPrimesUpTo(int input) {
		
		boolean [] list = new boolean [input];
		Arrays.fill(list,true);
		list[0] =false;
		list[1] =false;
		
		for(int i=2; i<input; i++) {
			if(list[i]==true)
			for(int j=0; i*j<input; j++)
				list[i*j]=false;
		}
		
		int numberOfPrimes=0;
		
		for(int k=0; k<input; k++) {
			if(list[k]==true) {
		//for (boolean b : list) {
			
			//if(b==true)
		
				numberOfPrimes++;
			}
		}
		System.out.println("There are "+numberOfPrimes+" prime numbers up to "+input);
		
	}

}

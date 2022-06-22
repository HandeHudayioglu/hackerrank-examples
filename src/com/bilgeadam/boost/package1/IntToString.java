package com.bilgeadam.boost.package1;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		if((input>=-100)&&(input<=100)) {
			System.out.println("Good job");
		} else {
			System.out.println("Wrong answer");
		}
		
		
	

	}

}

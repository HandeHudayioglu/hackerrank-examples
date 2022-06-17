package com.bilgeadam.boost.package1;

import java.util.Scanner;

public class AlignAndGiveCode {

	public static void main(String[] args) {
		
		 
		 Scanner scan = new Scanner (System.in);
		 System.out.println("Enter a lessons name: ");
		 String s = scan.nextLine();
		 System.out.println("Enter a lesson code: ");
		 int i = scan.nextInt();
		 
		System.out.printf("%-15s", s);
		System.out.printf("%03d%n",i);
	      
	}

}

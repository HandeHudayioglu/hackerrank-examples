package com.bilgeadam.boost.package1;

import java.util.Random;
import java.util.Scanner;

public class StaticInitializerBlock {
	

	

	public static void main(String[] args) {
		
		area();

	}
	
	public static void area() {
		
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the breadth:");
		double b = scan.nextDouble();
		System.out.print("Enter the height:");
		double h = scan.nextDouble();
		
		
		
			if((b>=0)&&(h>=0)) {
				System.out.println(b*h);
			} else {
		 	
			System.err.println("java.lang.Exception:Breadth and height must be positive." );
		}
		
	}
		
	

}

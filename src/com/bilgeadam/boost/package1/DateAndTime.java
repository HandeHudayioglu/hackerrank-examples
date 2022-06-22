package com.bilgeadam.boost.package1;

import java.time.LocalDate;
import java.util.Scanner;

public class DateAndTime {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		int day = scan.nextInt();
		int year = scan.nextInt();
		
	
		
		System.out.println(findDay(12,8,2020));

	}
	
	 public static String findDay(int month, int day, int year) {


			
		 
		 return LocalDate.of(year, month, day).getDayOfWeek().name();
	    }
}

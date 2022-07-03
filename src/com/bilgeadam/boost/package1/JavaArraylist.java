package com.bilgeadam.boost.package1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		for (int i=0; i<input; i++) {
			ArrayList<Integer> list2=new ArrayList<>();
			int n = scan.nextInt();
			for(int j=0;j<n;j++) {
				
				list2.add(scan.nextInt());
			}
			
			list.add(list2);
		}
		
		int x = scan.nextInt();
		
		for(int k=0; k<x;k++) {
			
			int a=scan.nextInt();
			int b=scan.nextInt();
		
		try {
		System.out.println(list.get(a-1).get(b-1));
			
		} catch (IndexOutOfBoundsException e ){
			
			System.out.println("ERROR!");
			
		}
		
	}
	
	} 

}

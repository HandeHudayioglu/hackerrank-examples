package com.bilgeadam.boost.package1;

import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {
	
		
		 Scanner scan = new Scanner(System.in);
		    int size = scan.nextInt();
		    int[] list = new int[size];
		    int[][] list2 = new int[size][size];
		    int count = 0;
		    for(int i=0;i<size;i++){
		        list[i] = scan.nextInt();
		        if(list[i] < 0) count++;
		        list2[i][i] = list[i];
		        for(int j=0;j<i;j++){
		            list2[j][i] = list2[j][i-1]+list[i];
		            if(list2[j][i] < 0) count++;
		        }
		    }
		    System.out.println(count);
		}
			  
			
			
			
	
}

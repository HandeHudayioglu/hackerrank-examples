package com.bilgeadam.boost.package1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Java2DArray {

	public static void main(String[] args) {
		
	
		
		int[][] list = new int [6][6];
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6;j++) {
				if(j==3) {
					list[i][j]=3;
				}
				else {
				
				list[i][j]=1;
				
				System.out.print(list[i][j]+" ");
			}
				
		}
			System.out.println();
		
		}
		
	}
		
		
//		for(int i=0; i<6; i++) {
//			for(int j=0; j<6; j++) {
//			
//			Random rnd = new Random();
//			list [i][j] = rnd.nextInt(9);
//		
//		
//			System.out.print(list[i][j]+" ");
//
//	}       
//			
//			System.out.println();
//		}
		
//		Java2DArray l = new Java2DArray();
//		l.hourglassSum(list);
//		
		
		

	
	static int hourglassSum(int[][] arr) {
    
      int sum=0;
       for(int i=0;i<arr[0].length-2;i++){
           for(int j=0;j<arr[0].length-2;j++){
               arr[i][j]=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
           }
       }
       sum=Integer.MIN_VALUE;

       for(int i=0;i<arr[0].length-2;i++){
           for(int j=0;j<arr[0].length-2;j++){
               if(arr[i][j]>=sum)sum=arr[i][j];
           }
       }
       System.out.println(sum);
       return(sum);

   }
}
package com.bilgeadam.boost.package1;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		for (int i = 0; i < input; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int n = scan.nextInt();
		

       int total=a; 
        
        for(int j=0; j<n; j++) {
            
        	
            total+=(b*Math.pow(2, i));
        
           System.out.print(total+"  ");
    }
	
        System.out.println();
	}

}
}

package com.bilgeadam.boost.package1;

public class MaxMin {

	public static void main(String[] args) {
		
		
		
		int [] list = {9,6,-5,-9,0};
		
		int min= list[0];
		int max=list[0];
		
		
		for (int i : list) {
			
			if(i<min) {
				min=i;
			}
			if(i>max) {
				max=i;
			}
			
		}
		
		System.out.println("Minimum: "+min+" / "+" Maximum: "+max);

	}

}

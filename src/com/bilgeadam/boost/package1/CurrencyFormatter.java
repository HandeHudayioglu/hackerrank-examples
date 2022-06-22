package com.bilgeadam.boost.package1;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter {

	public static void main(String[] args) {
	
		
		double x=12324.134;
		
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		Locale indiaLocale = new Locale ("en", "IN");
		NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);
		 
		
		System.out.println(us.format(x));
		System.out.println(india.format(x));
		System.out.println(china.format(x));
		System.out.println(france.format(x));
		
		
	}

}

package com.java.currency;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	    //    Locale.setDefault(Locale.US);
	        	NumberFormat us_Format = NumberFormat.getCurrencyInstance(Locale.US);
	         String us=us_Format.format(payment);
	         
	         NumberFormat china_Format = NumberFormat.getCurrencyInstance(Locale.CHINA);
	         String china=china_Format.format(payment);
	         
	       NumberFormat france_Format = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	         String france=france_Format.format(payment);
	         
	         Locale.setDefault(new Locale("en","IN"));
	         NumberFormat india_Format = NumberFormat.getCurrencyInstance();
	         String india=india_Format.format(payment);
	         
	         
	         
	         System.out.println(us);
	     
	       //  System.out.println("US: " + nf.format(payment));
	         System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
	         System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
	         Locale.setDefault(new Locale("en","IN"));
	         System.out.println("US: " + NumberFormat.getCurrencyInstance().format(payment));
	         
		        
		System.out.println("----");        
	        
	       System.out.println("US: " + us);
	        System.out.println("India: " + india);
	        System.out.println("China: " + china);
	        System.out.println("France: " + france);
	}
}

package com.java.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Solution {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
	        
	        Calendar cal=Calendar.getInstance();
	        System.out.println(cal);
	        
	 //       cal.set(year., month, day);
	        
	        System.out.println(cal.getTime());
	        cal.set(Calendar.MONTH,Integer.parseInt(month)-1);
	        cal.set(Calendar.YEAR,Integer.parseInt(year));
	        cal.set(Calendar.DAY_OF_MONTH,Integer.parseInt(day));
	        
	        Date date=cal.getTime();
	    //    System.out.println(date.g);
	        
	        SimpleDateFormat formatter=new SimpleDateFormat("EEEE");
	        
	        System.out.println(formatter.format(date).toUpperCase());
	        
	      //  System.out.println(cal.getTime().g);
}
	 
}

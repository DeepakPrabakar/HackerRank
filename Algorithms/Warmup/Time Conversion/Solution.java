import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
	        String time = in.next();
	    
          /*
            StringBuilder t= new StringBuilder(time);
	        String clock=time.substring(8,time.length());
	        String add;
	        int num=Integer.parseInt(time.substring(0,2));
	        if(clock.equals("PM") && num!=12)
            {
                add=""+(num+12);
	            t.replace(0,2,add);
	        }
	        if(clock.equals("AM") && num==12)
	        { 
                add="00";
    	        t.replace(0,2,add);
	        }
	        t.replace(8,time.length(),"");
	        
	       System.out.println(t);
        */
        //(or)
        SimpleDateFormat sdf_in = new SimpleDateFormat("hh:mm:ssa");
		SimpleDateFormat sdf_out = new SimpleDateFormat("HH:mm:ss");
		
		try {
			Date date = sdf_in.parse(time);
			System.out.println(sdf_out.format(date));
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
        
      
    }
}

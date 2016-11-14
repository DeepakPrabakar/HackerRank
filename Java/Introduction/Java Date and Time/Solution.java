import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        Calendar cal=Calendar.getInstance();
        cal.set(Calendar.MONTH,Integer.parseInt(month)-1);
	    cal.set(Calendar.YEAR,Integer.parseInt(year));
	    cal.set(Calendar.DAY_OF_MONTH,Integer.parseInt(day));
        
        Date date=cal.getTime();
    	SimpleDateFormat formatter=new SimpleDateFormat("EEEE");
	    
        System.out.println(formatter.format(date).toUpperCase());
	        
        
        
    }
}

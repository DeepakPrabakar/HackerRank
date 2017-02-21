import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

      static String single_digits[] = { "zero", "one", "two", "three", "four",
                              "five", "six", "seven", "eight", "nine"};
 
    /* The first string is not used, it is to make array indexing simple */
    static String two_digits[] = {"", "ten", "eleven", "twelve", "thirteen", "fourteen",
                     "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
 
    /* The first two string are not used, they are to make array indexing simple*/
    static String tens_multiple[] = {"", "", "twenty", "thirty", "forty", "fifty",
                             "sixty", "seventy", "eighty", "ninety"};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        
        Map<Integer,String> map = new LinkedHashMap<>();
        
        map.put(00,"o' clock");
        map.put(01,"minute past");
        map.put(02,"minutes past");
        map.put(15,"quarter past");
        map.put(30,"half past");
        map.put(31,"minutes to");
        map.put(45,"quarter to");
        map.put(59,"minute to");
        
        
        if(m == 00)
            System.out.println(single_digits[h]+" "+map.get(m));
         else if(m == 59)
            System.out.print(single_digits[60-m]+" "+map.get(59));
      
        else if(m >= 51)
            System.out.print(single_digits[60-m]+" "+map.get(31));
             
          if(h>=10)   System.out.print(" "+two_digits[12-h]);
             
               else if(m ==40)
            System.out.println(tens_multiple[2]+" "+map.get(31)+" "+single_digits[h+1]);
        else if(m ==45)
            System.out.println(map.get(45)+" "+single_digits[h+1]);
     
             else if(m >= 41 && m<=50)
            System.out.println(two_digits[51-m]+" "+map.get(31)+" "+single_digits[h+1]);
       
      
        else if(m >= 32 && m<40)
            System.out.println(tens_multiple[2]+" "+single_digits[40-m]+" "+map.get(31)+" "+single_digits[h+1]);
      
           
            
         else if(m == 30)
            System.out.println(map.get(m)+" "+single_digits[h]);
         else if(m == 15)
            System.out.println(map.get(15)+" "+single_digits[h]);
        else if(m > 20)
            System.out.println(tens_multiple[2]+" "+single_digits[m-20]+" "+map.get(02)+" "+single_digits[h]);
        else if(m == 20)
            System.out.println(tens_multiple[2]+" "+map.get(02)+" "+single_digits[h]);
        else if(m >= 10)
            System.out.println(two_digits[m-9]+" "+map.get(02)+" "+single_digits[h]);
           
          else if(m >= 02)
            System.out.println(single_digits[m]+" "+map.get(02)+" "+single_digits[h]);
       else if(m == 01)
            System.out.println(single_digits[m]+" "+map.get(m)+" "+single_digits[h]);
       
        
        
        
        
        
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
       
       /*
        int s=3;
        
        long i=1;
        long val=s;
        while(i<t) {
            
            val--;
            i++;
            if(val==0) {
                s=s*2;
                val=s;
            }
        }
        System.out.println(val);
        
         */
        
        long s=3;
        long chk=s;
        while(t > chk) {
            
            s = s*2;
            chk= chk+s;
        }
        System.out.println(chk-t+1);
        
      
        
    }
}

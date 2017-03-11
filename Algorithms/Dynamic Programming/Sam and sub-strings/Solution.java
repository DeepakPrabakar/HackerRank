import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 
public class Solution {
 
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s= scan.next();
       long total=0;
         
        long f = 1;
        for(int i = s.length()-1; i &gt;= 0; i--) {
            total = (total + (s.charAt(i)-'0')* f * (i+1)) % (long)(Math.pow(10,9)+7);
            f = (f*10+1) % (long)(Math.pow(10,9)+7);
        }
       System.out.println(total);
         
    }
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static long counta(String s) {
        
        long count=0;
        char c[]= s.toCharArray();
        for(int i=0;i<c.length;i++) {
            if(c[i]=='a') count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        
        long count=0;
        long base = counta(s);
        
        count = n/s.length() * base;

        long chk=n%s.length();
        if(chk !=0) { 
            char c[]= s.toCharArray();
            for(int i=0;i<chk;i++) {
                if(c[i]=='a') count++;
            }
        }
        System.out.println(count);
    }
}

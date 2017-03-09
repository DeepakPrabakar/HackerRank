import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        
        int count=0;
        for(int i=0;i<n-3+1;i++) {
            
            if(B.charAt(i)=='0' && B.charAt(i+1)=='1' && B.charAt(i+2)=='0') {
                count++;
                i+=2;
            }
        }
        System.out.println(count);
        
    }
}

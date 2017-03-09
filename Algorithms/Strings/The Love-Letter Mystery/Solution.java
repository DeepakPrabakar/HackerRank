import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        for(int k=0;k<t;k++){
            String s= scan.next();
            int count=0;
            for(int i=0;i<s.length()/2;i++) {
                count =count + Math.abs(s.charAt(i)-s.charAt(s.length()-1-i));
            }
            System.out.println(count);
        }
    }
}
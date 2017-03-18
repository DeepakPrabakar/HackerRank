import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        int t =scan.nextInt();
        
        for(int ti=0;ti<t;ti++) {
            String a =scan.next();
            String b =scan.next();

            int flag=0;
            
            
            for(char c='a'; c<='z';c++) {
                if(a.contains(""+c) && b.contains(""+c)) {
                    flag=1;
                    break;
                }
            }
            
         /*   for(int i=0;i<a.length();i++) {

                if(b.contains(""+a.charAt(i))){
                    flag=1;
                    break;
                }
            }
           */ 
            System.out.println((flag==1)?"YES":"NO");
        }
        
    }
}
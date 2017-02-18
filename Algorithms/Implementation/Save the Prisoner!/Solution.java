import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        
        for(int i=0;i<t ;i++)
        {
            int n= scan.nextInt();
            int m= scan.nextInt();
            int s= scan.nextInt();
            
            int res = (m+s-1) % n;
            
            System.out.println((res==0 )? n: res);
            // res will be zero if the last sweet is given to the last prisoner
        
        }
    }
}
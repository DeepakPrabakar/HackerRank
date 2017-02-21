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
        
        for(int k=0;k<t;k++)
        {
            int n= scan.nextInt();
            int a= scan.nextInt();
            int b= scan.nextInt();
            int dup=0;
            
            if(a>b)
            {
                a=a+b;
                b=a-b;
                a=a-b;
            }
            for(int i=0;i<n;i++)
            {
                int val= a*(n-i-1) + i*b;
                if(dup!=val)
                    {
                        System.out.print(val+" ");        
                        dup=val;
                }
            }
            System.out.println();
        }
    }
}
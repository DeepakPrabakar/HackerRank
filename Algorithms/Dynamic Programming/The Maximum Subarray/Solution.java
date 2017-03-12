import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
        
        int t = scan.nextInt();
        for(int ti=0;ti<t;ti++) {
            
            int n = scan.nextInt();
            int a[] = new int[n];
            int neg=0;
            int nc_max=0;
            int least=Integer.MIN_VALUE;
            int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
     
            for(int i=0;i<a.length;i++) {
                a[i]=scan.nextInt();

                if(a[i]>0)nc_max+=a[i];
                if(a[i]<0) {
                    neg++;
                    if(a[i]>least)
                        least=a[i];
                }
                
                max_ending_here = max_ending_here + a[i];
                if (max_so_far < max_ending_here)
                    max_so_far = max_ending_here;
                if (max_ending_here < 0)
                    max_ending_here = 0;
            }
            System.out.print(max_so_far);
            
            if(neg==n)System.out.println(" "+least);
            else System.out.println(" "+nc_max);
        }
    }
}
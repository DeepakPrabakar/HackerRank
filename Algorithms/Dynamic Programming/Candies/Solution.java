import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int a[] = new int[n];
        int candies[] = new int[n];
        long total=0;
        for(int i=0;i<n;i++) {
            a[i]= scan.nextInt();
            candies[i]=1;
            if(i>0) {
                if(a[i]>a[i-1]) candies[i]+=candies[i-1];
            }
        }
        for(int i=n-2;i>=0;i--) {
            if(a[i]>a[i+1])
                while(candies[i]<=candies[i+1])
                    candies[i]++;
            
            total+=candies[i];
        }
        total+=candies[n-1];
        
        System.out.println(total);
        
    }
}
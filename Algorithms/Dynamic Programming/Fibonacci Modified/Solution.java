import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t1=scan.nextInt();
        int t2=scan.nextInt();
        int n=scan.nextInt();
        
        BigInteger a[] = new BigInteger[n+1];
        a[1]=BigInteger.valueOf(t1);
        a[2]=BigInteger.valueOf(t2);
        for(int i=1;i<=n-2;i++) {
            a[i+2] = BigInteger.valueOf(0);
            
            a[i+2]=a[i+2].add(a[i]);
            BigInteger c =a[i+1];
            a[i+2]=a[i+2].add((c.multiply(c)));
            
        }
        
        System.out.println(a[n]);
    }
}
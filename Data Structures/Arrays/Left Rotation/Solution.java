import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int d=scan.nextInt();
        
        int a[]=new int[n];        
        
        for(int i=0;i<n;i++)
            a[(i-d+n)%n]=scan.nextInt();
        
        for(int i=0;i<n;i++)
            System.out.print(a[i]+ " ");
    }
}
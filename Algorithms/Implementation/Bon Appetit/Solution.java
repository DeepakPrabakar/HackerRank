import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        int n= scan.nextInt();
        int k= scan.nextInt();
        
        int a[]= new int[n];
        int total=0;
        int nok=0;
        for(int i=0;i< n;i++)
        {
            a[i]=scan.nextInt();
            total=total+a[i];
            
            if(i!=k)nok=nok+a[i];
        }
        
        int charged=scan.nextInt();
        if(nok/2==charged)
            System.out.println("Bon Appetit");
        else
            System.out.println(charged-nok/2);
        
    }
}
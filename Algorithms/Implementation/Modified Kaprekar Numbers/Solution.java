import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static boolean checkKaprekar(long n)
    {
        if(n==1)   
            return true;
        
        long sq= n*n;
        String num = String.valueOf(sq);

        int len = num.length();
        int half = num.length()/2;

        if(len==1)
            return false;
          
        int l=Integer.parseInt(num.substring(0,half));
        int r=Integer.parseInt(num.substring(half));

        if(l+r == n)           
            return true;

        return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan = new Scanner(System.in);
        
        int p= scan.nextInt();
        int q= scan.nextInt();
        
        int count=0;
        for(int i=p;i<=q;i++)
        {
            boolean result = checkKaprekar(i);
            
            if(result)
            {   count++;
                System.out.print(i+" ");
            }   
        }
        if(count==0)
             System.out.println("INVALID RANGE");
                        

        
    }
}
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
        
        for(int i=0;i<t;i++)
        {   
               int a= scan.nextInt();
               int b= scan.nextInt();
            
                        
            int result = (int)Math.floor(Math.sqrt(b)) - (int)Math.ceil(Math.sqrt(a)) + 1;
              System.out.println(result);            
            /*
            
            // below code will be timeout
            int count =0;
            for(int j=a;j<=b;j++)
            {
                double d=Math.sqrt(j);
                if(d == (int)d)count++;

            }
                System.out.println(count);            
            
            */
        }
    }
}
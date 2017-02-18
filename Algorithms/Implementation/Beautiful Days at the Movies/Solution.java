import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int reversed(int x)
    {
        int s=0;
        while(x!=0)
        {
            int r= x%10;
            s=s*10+r;
            x=x/10;
        }
        return s;
        
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        int i= scan.nextInt();
        int j= scan.nextInt();
        int k= scan.nextInt();
        
        int count =0;
        while(i<=j)
        {
            int rev = reversed(i);
            if(Math.abs(i-rev)%k == 0)count++;
            i++;    
        }
        System.out.println(count);
        
    }
}
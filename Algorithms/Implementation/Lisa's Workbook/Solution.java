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
        
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
        }
        
        int page=0;
        int spl=0;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=arr[i];j++)
            {
                if(j%k==1 || k==1)page++;

                if(j==page) spl++;
            }
        }
        
        System.out.println(spl);
      
    }
}
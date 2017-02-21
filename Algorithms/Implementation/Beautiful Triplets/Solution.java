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
       int d= scan.nextInt();
       
        int arr[] = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
            list.add(arr[i]);
        }
        
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(list.contains(arr[i]+d) && list.contains(arr[i]+2*d) )
                count++;
        }
        
        System.out.println(count);
    }
}
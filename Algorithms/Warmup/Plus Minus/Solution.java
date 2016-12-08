import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        double pos=0,neg=0,zero=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)pos++;
            else if(arr[i]<0)neg++;
            else zero++;
            
        }
         System.out.printf("%.6f\n", pos/n);
         System.out.println(String.format("%.6f", neg/n));
         DecimalFormat f = new DecimalFormat("##.000000");
         System.out.println(f.format(zero/n));
  
        
    }
}

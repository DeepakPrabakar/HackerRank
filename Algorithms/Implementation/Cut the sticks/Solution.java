import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int getSmall(int arr[],int n)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0 && arr[i]<min)
                min=arr[i];
        }
        return min;
    }
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        int length = arr.length;
        int count=0;
        while(length!=0)
        {
            int small = getSmall(arr,n);
            System.out.println(length);
            count=0;
            for(int i=0;i<n;i++)
            {
                arr[i]-=small;    
                if(arr[i]==0)count++;
                
            }
            length -= count;
        }
    }
}

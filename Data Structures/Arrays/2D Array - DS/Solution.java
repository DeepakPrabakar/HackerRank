import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        int max=0;        
        for(int i=1;i<6-1;i++)
        {
            for(int j=1;j<6-1;j++)
            {
                
                int sum= arr[i][j]+arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+
                                 arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
                
                if(i==1 && j==1) max=sum;
                if(sum>max)
                    max=sum;
                    
            }
            
        }
        System.out.println(max);
    }
}

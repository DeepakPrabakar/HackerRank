import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][]= new int[n][n];
        String grid[] = new String[n];
        for(int i=0;i < n; i++){
            grid[i] = in.next();
            for(int j=0;j<grid[i].length();j++){
                 //int x = Character.getNumericValue(grid[i].charAt(j));
                 int x = Integer.parseInt(""+grid[i].charAt(j));
                
                 a[i][j]=x;
            }
        }
    
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                if(i==0 || i== n-1 || j==0 || j == n-1)
                       System.out.print(a[i][j]);
                else 
                {
                    if(a[i][j]>a[i-1][j] && a[i][j]>a[i+1][j] && a[i][j]>a[i][j-1] && a[i][j]>a[i][j+1])
                    System.out.print('X');
                else
                       System.out.print(a[i][j]);
                }
                 
            }
            System.out.println();
        }
    }
}

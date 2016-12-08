import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int m=n;  
        
        for(int j=0;j<n;j++)
            {
            for(int i=m;i>1;i--)
                System.out.print(" ");
            
           for(int i=n-m+1;i>0;i--)
            System.out.print("#");
        
        System.out.println();
        m--;
    }
       
    }
}

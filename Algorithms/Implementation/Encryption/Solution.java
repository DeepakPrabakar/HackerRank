import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        
        s=s.trim().replaceAll("\\s+","");
        
        int n= (int)Math.floor(Math.sqrt(s.length()));
        int m= (int)Math.ceil(Math.sqrt(s.length()));
        
        while(n*m < s.length())
        {
            if(n<m)n++;
            else
                m++;
        }        
        
        String disp[]= new String[n];
        
        for(int i=0;i<n;i++)
        {
            disp[i]= new String();
            if(i==n-1)
                disp[i]=s.substring(m*i);    
            else
                disp[i]=s.substring(m*i,m*i+m);    
        }
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n && i<disp[j].length();j++)
            {
                System.out.print(disp[j].charAt(i));
                
            }
                System.out.print(" ");
        }
        
        
    }
}

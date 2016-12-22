import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan =new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        String s[]= new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=new String();
            s[i]=scan.nextLine();
        }
        int q= Integer.parseInt(scan.nextLine());
        String s1[]= new String[q];
        for(int i=0;i<q;i++)
        {
            s1[i]=new String();
            s1[i]=scan.nextLine();
        }
        
        for(int i=0;i<q;i++)
        {
            int total=0;
            for(int j=0;j<n;j++)
            {                   
                if(s1[i].equals(s[j]))
                   total++;
            }
            System.out.println(total);
        }
        
    }
}
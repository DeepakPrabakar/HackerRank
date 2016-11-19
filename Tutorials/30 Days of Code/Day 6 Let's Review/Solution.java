import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        //int n;
        scan.nextLine();
        while(n-->0)
        {
            String input=scan.nextLine();
            
            for(int i=0;i<input.length();i+=2)
                System.out.print(input.charAt(i));
            
            System.out.print(" ");
            
            for(int i=1;i<input.length();i+=2)
                System.out.print(input.charAt(i));
            
            System.out.println();            
            
        }
            
    }
}
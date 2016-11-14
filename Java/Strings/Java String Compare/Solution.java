import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        int k=scan.nextInt();
        
        String min="",max="";
        
        for(int i=0;i<=input.length()-k;i++)
        {
                String sub=input.substring(i,i+k);
               if(i==0)min=max=sub;

                else
	                {
	                   
	                    if(sub.compareTo(min)<0)min=sub;
	                    else if(sub.compareTo(max)>0)max=sub;
	                    
	                }
        }
        System.out.println(min);
        System.out.println(max);
            
        
    }
}
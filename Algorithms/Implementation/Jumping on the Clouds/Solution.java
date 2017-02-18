import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
      
    
        int jump=0;
       
        // from editorial
        for(int i=0;i<n-1;)
         {
            if((i+2)==n || c[i+2]==1)i+=1;
                else i+=2;
                jump++;
        }
          System.out.println(jump);
        
        // below also works
        /*for(int i=2;i<n;i+=2)
        {
                if(c[i]==1)i-=3;
                    else
                 {
                    jump++;   
                }
            if(i+2== n)i--;
        }
         if(n==2) 
             jump=1;
        System.out.println(jump);
        
        */
    }
}

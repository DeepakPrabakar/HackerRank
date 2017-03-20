import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }
        
        int rank=1;
        for(int i=1;i<n;i++) {
            if(scores[i]<scores[i-1])rank++;
        }
       // System.out.println(rank);
        rank++;
       // System.out.println(rank);
        int last=n-1;
       
            for(int j=0;j<m;j++) {
               if(alice[j]>=scores[0])rank=1;
                
                while(last>0 && alice[j]>=scores[last]){
         //           System.out.println("lat: "+last);
                    last--;
                    if(scores[last]!=scores[last+1])rank--;
                    if(rank<0)rank=1;
                   
                }
                 System.out.println(rank);
            }
      //  System.out.println(rank);
//        7
//100 100 50 40 40 20 10
//4
//5 25 50 120
        // your code goes here
    }
}

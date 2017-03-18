import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        int max=0,min=0;
        int max_c=0,min_c=0;
        
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
            
            if(score_i==0)max=min=score[score_i];
            
            else {
                if(score[score_i]>max) {
                    max=score[score_i];
                    max_c++;
                }
                else if(score[score_i]<min) {
                    min=score[score_i];
                    min_c++;
                }
                
            }
        }
        System.out.println(max_c+" "+min_c);
        // your code goes here
    }
}

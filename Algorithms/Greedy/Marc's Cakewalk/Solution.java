import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        
        Arrays.sort(calories);
        
        long sum=0;
        for(int i=calories.length-1;i>=0;i--) {
            long cal=(long)(calories[i]*Math.pow(2,calories.length-i-1));
            sum =sum + cal;
        }
        System.out.println(sum);
            // your code goes here
    }
}

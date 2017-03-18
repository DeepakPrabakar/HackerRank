import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        int[] count = new int[n];
        int[] count2 = new int[n];
        
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
            count[types[types_i]]++;
            count2[types[types_i]]++;
            
        }
        
        Arrays.sort(count);
        for(int i=0;i<n;i++) {
            if(count2[i]==count[n-1]) {
                System.out.println(i); 
                break;
            }
        }
        // your code goes here
    }
}

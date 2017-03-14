import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] c = new int[t];
        int remaining=n;
        int total=0;
        for(int c_i=0; c_i < t-1; c_i++){
            c[c_i] = in.nextInt();
            remaining -=c[c_i];
            if(remaining < 5) {
                int add=n-remaining;
                total = total+add;
                remaining+=add;
            }
        }
        System.out.println(total);
        // your code goes here
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            
            int chocolates= n/c;
            int wrappers= chocolates;
            int remaining=0;
            while(wrappers >= m)
                {
                remaining = remaining +wrappers%m;
                wrappers = wrappers/m;
                  
                chocolates = chocolates + wrappers;
            }
            System.out.println(chocolates+ (remaining+wrappers)/m);
        }
    }
}

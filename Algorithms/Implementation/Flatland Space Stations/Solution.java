import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        Arrays.sort(c);
        
        int maxDist=c[0];
        
        for(int i=1;i<c.length;i++) {
            int dist = (c[i]- c[i-1]) / 2;
            if(dist> maxDist)
                maxDist = dist;
        }
        
        int lastDist = n-1 - c[m-1];
        if(lastDist> maxDist)
            maxDist = lastDist;
        
        System.out.println(maxDist);
    }
}

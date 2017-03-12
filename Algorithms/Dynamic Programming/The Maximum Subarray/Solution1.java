import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i<n;i++){
            int curmax = Integer.MIN_VALUE;
            int prev = 0;
            int noncont = Integer.MIN_VALUE;
            int g = s.nextInt();
            for(int j=0; j < g;j++){
                int cur = s.nextInt();
                if(cur > noncont && noncont < 0) noncont= cur;
                else if(cur > 0)noncont += cur;
                if(cur + prev >= cur)cur = cur + prev;
                if(cur > curmax)curmax= cur;
                prev = cur;
            }
            System.out.println(curmax + " " + noncont);
            
        }
    }
}
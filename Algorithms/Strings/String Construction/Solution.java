import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            char c[]= s.toCharArray();
            int count[] = new int[26];
            for(int i=0;i<c.length;i++) {
                count[c[i]-'a']++;
            }

            int sum=0;
            for(int i=0;i<26;i++) {
                if(count[i]!=0)sum++;
            }
            System.out.println(sum);
        }
        
        
    }
}
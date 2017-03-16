import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] count(String str) {
        
        char s[] = str.toCharArray();
        int c[] = new int[26];
        for(int i=0;i<s.length;i++) {
            
            c[s[i]-'a']++;
        }
        return c;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        String a = scan.next();
        String b = scan.next();
        
        int aa[] = count(a);
        int bb[] = count(b);
        
        int sum=0;
        for(int i=0;i<26;i++) {
            
            sum += (int)Math.abs(aa[i]-bb[i]);
        }
        System.out.println(sum);
        
        
    }
}
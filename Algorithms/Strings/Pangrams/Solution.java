import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.replaceAll("\\s+","");
        s=s.toLowerCase();
        char[] c= s.toCharArray();
        int count[]=new int[26];
        for(int i=0;i<s.length();i++) {
            
            count[c[i] - 'a']++;
        }
        
        int flag=0;
        for(int i=0;i<26;i++) {
            if(count[i]==0){
                flag=1;
                break;
        }
        }
        System.out.println((flag==1)?"not pangram":"pangram");
    }
}
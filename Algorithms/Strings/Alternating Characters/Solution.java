import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int count=0;
        for(int i=0;i<t;i++){
            String s= scan.next();
            count=0;
            for(int j=0;j<s.length()-1;j++)
            {
                if(s.charAt(j) == s.charAt(j+1)) 
                    count++;
            }
            System.out.println(count);
        }
    }
}
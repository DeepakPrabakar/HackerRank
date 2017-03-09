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
        int flag=0;
        for(int j=0;j<t;j++) {
            String s = scan.next();
            flag=0;
            for(int i=1;i<s.length();i++) {
                int fwd= Math.abs(s.charAt(i)-s.charAt(i-1));
                int back = Math.abs(s.charAt(s.length()-1-i+1)-s.charAt(s.length()-1-i));
                if(fwd!=back)
                    flag=1;
            }
            System.out.println((flag==1)?"Not Funny": "Funny");
        }
        
    }
}
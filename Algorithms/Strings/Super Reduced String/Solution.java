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
        
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0;i<sb.length()-1;)
        {
                if(sb.charAt(i) == sb.charAt(i+1))
                  {  sb.delete(i,i+2);
                    i=0;
                  }
            else
                i++;

        }
                System.out.println((sb.toString().equals(""))?"Empty String":sb);
    }
}
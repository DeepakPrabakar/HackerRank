package string.tokens;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.trim();
        if(s.length()==0)
            System.out.println(0);
        else if(s.length()>400000)
            return;            
        else
            {
            String delims = "[!,?.*_'@\\ ]+";
            
            String[] tokens = s.split(delims);
          	System.out.println(tokens.length);
           
            for(int i=0;i<tokens.length;i++)
                System.out.println(tokens[i]);
        }
          
        // Note: 1. can hv leading spaces
        //2. can hv only special characters
        //3.can be greater than 400000
        //4. trim the string in start rather than s.trim().split(delims)
            
        scan.close();
    }
}

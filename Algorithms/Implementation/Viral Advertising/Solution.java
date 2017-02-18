import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int people =5;
        
        int likes=0;
        for(int i=0;i<n;i++)
        {
            int liked =people/2;
            likes=likes+liked;
            people=liked*3;
            
        }
        System.out.println(likes);
        
    }
}
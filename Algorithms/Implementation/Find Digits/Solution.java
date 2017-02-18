import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int digits(int x)
    {
        int m=x;
        int count =0;
        while(x != 0)
        {
            int r=x%10;
            if(r!=0 && m %r==0) count++;
            x = x/10;
        }
        return count;
            
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(digits(n));
        }
    }
}

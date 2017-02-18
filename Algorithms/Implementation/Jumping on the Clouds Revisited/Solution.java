import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        int e=100;
        
        int i=k;
        
        int cloud= i%n;
        while(cloud!=0)
        {
                e--;
                if(c[cloud]==1)e=e-2;
                i+=k;
                cloud= i % n;                
        }
        e--;
        if(c[cloud]==1)e=e-2;
        System.out.println(e);
    }
}

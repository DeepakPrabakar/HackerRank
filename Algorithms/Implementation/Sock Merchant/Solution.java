import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        
        Arrays.sort(c);
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            if(c[i]==c[i+1]){ count++;
                            i++;
                            }
        }
        
       System.out.println(count);
    }
}

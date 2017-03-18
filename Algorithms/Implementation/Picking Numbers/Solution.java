import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        Arrays.sort(a);
        int count=0;
        int max=0;
        for(int i=0;i<n;i++) {
            count=0;
            for(int j=i+1;j<n;j++) {
                
                if(Math.abs(a[j]-a[i])<=1) count++;
                else {count=0;
                     break;
                     }
                if(count>max)
                max=count;
            }
            
        }
        System.out.println(max+1);
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int flag=0;
        int count=0;
        int low = a[a.length-1];
    //    System.out.println(low);
        for(int i= low;i<=b[0];i+=low) {
            flag=0;
            
            for(int j=0;j<a.length;j++) {
                if(i % a[j] == 0 ) {
                    flag++;
         //          System.out.println(i);
                }
            }
            
            for(int j=0;j<b.length;j++) {
                if(b[j] % i == 0 ) {
                    flag++;
           //        System.out.println(i);
                }
            }
            if(flag==a.length+b.length)
                count++;
        }
        
        System.out.println(count);
        
    }
}

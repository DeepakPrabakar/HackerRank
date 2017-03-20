import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        int n= scan.nextInt();
        int k= scan.nextInt();
        
        int a[] = new int[n];
        int luck=0;
        int notadd=0;
        
        for(int i=0;i<n;i++) {
            int l= scan.nextInt();
            int t= scan.nextInt();
            
            if(t==0){luck = luck + l;
                    notadd++;}
            if(t==1) a[i]=l;
         
        }
        
        Arrays.sort(a);
        
        int i=n-1;
        for(;i>=notadd + (n-notadd-k);i--) {
            luck = luck +a[i];
        }
        
        for(;i>=notadd;i--) {
            luck = luck -a[i];
        }
        
        System.out.println(luck);
        
    }
}
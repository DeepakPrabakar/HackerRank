import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        
        // timeout in few test cases
        /*
        long count =0;
        
        for(long i=0;i<=n;i++) {
            if( (n+i) == (n^i))count++;
        }
        System.out.println(count);
        
        */
        
        
        //works
        //// http://pidanic.com/en/blog/hackerrank-sum-vs-xor/
        /*
        int empty = 64 - Long.numberOfLeadingZeros(n) - Long.bitCount(n);
    System.out.println(new BigInteger("2").pow(empty));
        
        */
        
        // works
        // dont know..chk
        /*
            long totalNumbers=1;
    while (n>1){
      if (n%2==0){
          totalNumbers=totalNumbers*2;
      }
      n=n/2;
    }
    System.out.println(totalNumbers);
        
        */
        
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan =new Scanner(System.in);
        BigInteger a=scan.nextBigInteger();
        BigInteger b=scan.nextBigInteger();
        
        BigInteger c=a.multiply(b);
        System.out.println(a.add(b));
        System.out.println(c);
            
        
    }
}

/*
123456789123456789
100000000000000000



223456789123456789
12345678912345678900000000000000000


*/
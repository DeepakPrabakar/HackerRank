import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int da,ma,ya;
        int de,me,ye;
        
        da=scan.nextInt();
        ma=scan.nextInt();
        ya=scan.nextInt();
        de=scan.nextInt();
        me=scan.nextInt();
        ye=scan.nextInt();        
        
        int yearLate= ya-ye;
        int monthsLate= ma-me;
        int daysLate= da-de;
     
        System.out.println ((ya - ye > 0 ) ? 10000 
                                        : (ma - me > 0 && yearLate == 0) ? monthsLate * 500
                                                : (da - de > 0 && yearLate == 0) ? daysLate * 15
                                                         : 0
                         ); 
        
    }
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            
            if(s.matches(".*h.*a.*c.*k.*e.*r.*r.*a.*n.*k.*"))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}

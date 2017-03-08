import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            // your code goes here
            if(grade < 38)
                System.out.println(grade);
            else if(grade % 5 <3)                
                System.out.println(grade);
            else
                System.out.println(grade+ (5- grade % 5));
        }
    }
}

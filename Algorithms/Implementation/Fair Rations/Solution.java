import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        int oddCount = 0;
        int oddDiff=0;
        int prevOdd=0;
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
            if(B[B_i] % 2 ==1) {
                oddCount++;
                
                if (oddCount % 2 ==0 ){
                    oddDiff = oddDiff + (B_i-prevOdd);
                }
                prevOdd=B_i;
            }
        }
        
        if(oddCount % 2 == 1) System.out.println("NO");
        else
            System.out.println(oddDiff*2);
    }
}

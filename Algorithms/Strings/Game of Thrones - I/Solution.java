import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        
        int count[] = new int[26];
        
        for(char c:inputString.toCharArray()) {
            count[c-'a']++;
        }
        
        int OddCount=0;
        for(int i=0;i<26;i++) {
            if(count[i]%2 != 0)OddCount++;
        }
        
        String ans=(OddCount>1)?"NO":"YES";
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        System.out.println(ans);
        myScan.close();
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    
    public static int[] getCharacterCount(String arr)
    {
        char array[] =arr.toCharArray();
        
        int count[]= new int[26];
        
        for(int i=0;i<array.length;i++)
        {
            count[array[i]-'a']++;    
        }
       return count;
        
    }
    public static int numberNeeded(String first, String second) {
      
        int first_arr[] = getCharacterCount(first);
        int second_arr[] = getCharacterCount(second);
        
        int count= 0;
        for(int i=0;i<26;i++)
        {
            if(first_arr[i]!=second_arr[i])
            {
                count = count+ Math.abs(first_arr[i]-second_arr[i]);    
            }
        }
        return count;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}

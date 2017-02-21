import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        Map<Integer,Integer> map = new LinkedHashMap<>();
        
        int min=Integer.MAX_VALUE;
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
            
            if(!map.containsKey(A[A_i]))
                map.put(A[A_i],A_i);
            
            else
            {    
                map.put(A[A_i],Math.abs(map.get(A[A_i])-A_i));
               
            int val =map.get(A[A_i]);  
            if(val < min)
                    min = val;
            }
        }
        System.out.println((min==Integer.MAX_VALUE)? -1 : min);
    }
}

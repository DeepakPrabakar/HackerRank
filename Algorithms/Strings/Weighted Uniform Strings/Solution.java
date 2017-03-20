import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
             
        Set<Integer> set = new LinkedHashSet<>();
        
        char c[] = s.toCharArray();
        int count=0;
   
        for(int i=0;i<c.length;i++) {
                    
            int val = c[i]-'a'+1;
            if(i==0)count= val;
            if(i>0) {
                if(c[i]==c[i-1]){
                    count= count+val;
                } 
                else if(c[i] != c[i-1]){
                    count=val;  
                } 
            }
              map.put(count,1);
            set.add(count);
        }
   
     //  System.out.println(map);
//         System.out.println(set);
        
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            //    System.out.println((map.get(x)!=null)?"Yes":"No");
            System.out.println((set.contains(x))?"Yes":"No");
        }
        
    }
}

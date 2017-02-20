import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Map.Entry;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        int n= scan.nextInt();
    /*    int arr[] = new int[n];
        
        Map<Integer,Integer> map= new LinkedHashMap<>(); 
        for(int i=0;i<n;i++)
        {
            arr[i]= scan.nextInt();
            
            if(!map.containsKey(arr[i]))
                map.put(arr[i],1);
            else
                map.put(arr[i],map.get(arr[i])+1);    
            
        }
        
        int max=0;
        for(Entry<Integer,Integer> entry : map.entrySet())
        {
            int val=entry.getValue();
            if(val>max)
                max=val;
        }
     //   System.out.println(max);
        int sum=0;
        int flag=0;
         for(Entry<Integer,Integer> entry : map.entrySet())
        {
            int val=entry.getValue();
            sum+=val;
            if(val==max&&flag==0){
                sum-=val;
                flag=1;
            }
                
        }
        System.out.println(sum);
        */
         int[] arr =new int[200];
        int max = 0;
        for(int i = 0; i<n;i++){
            int num = scan.nextInt();
            arr[num]++;
            if(arr[num] > max)
                max = arr[num];
        }
        System.out.println(n-max);
        
    }
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   /* public static int fact(int n)
     {
        int f=1;
        while(n>=1)
            {
            f=f*n;
            n--;
        }
        return f;
    }
     */   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        int max=0;
        int s= n*(n-1)/2;
        //int teamStrength[] = new int[fact(n-1)];
        int teamStrength[] = new int[s];
        
        int count=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int team=0;
                for(int k=0;k<m;k++)
                {
                    if(topic[j].charAt(k)=='1' || topic[i].charAt(k)=='1')team++;
                    
                }
             //   System.out.println(team);
                teamStrength[count++]=team;
                if(team>max)
                    max=team;
            }
            
        }
        
        int ans=0;
        for(int i=0;i<count;i++)
        {
               if(teamStrength[i]==max) ans++;
        }
        System.out.println(max);
        System.out.println(ans);
        
    }
}

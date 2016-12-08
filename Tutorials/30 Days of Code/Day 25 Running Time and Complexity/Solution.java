import java.io.*;
import java.util.*;

public class Solution {

    public static boolean checkPrime(int n)
    {
        /*
        if(n==1)
            return false;
        int sum=0;
        for (int i=2;i<=n;i++)
            if(n%i==0)sum++;
            
        if(sum==1)
            return true;
        else 
            return false;
            
            */
        
        if(n == 1){
        return false;
        }
        if(n == 2){
            return true;
        }
        for (int i = 2; i*i<=n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        
        while(t-- > 0)
        {
            int n=scan.nextInt();
            System.out.println(checkPrime(n)? "Prime": "Not prime");
        }
    }
}
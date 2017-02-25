import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static long makeChange(int[] coins, int money, int index, 
        HashMap<String, Long> memo) {
        
        /*
        long[] arr = new long[money+1];
        
        for(int i=1; i<=money; i++) {
            arr[i] = 0;
        }
        arr[0] = 1;
        
        for(int coin: coins) {
            for(int j = coin; j<=money; j++) { 
                    arr[j] += arr[j-coin];
            }
        }
                
        return arr[money];
        
        */
        
        if(money == 0)
            {
            return 1;
            
        }
        if(index >= coins.length){
            return 0;
        }
        
        String key = money+"-"+index;
        if(memo.containsKey(key))
            {
            return memo.get(key);
        }
        
        int amountWithCoin =0;
        long ways = 0;
        while(amountWithCoin <=money)
            {
            int remaining = money - amountWithCoin;
            ways += makeChange(coins,remaining,index+1,memo);
            amountWithCoin += coins[index];
        }
        memo.put(key,ways);
        return ways;
    }
     public static long makeChange(int[] coins, int money) {
        
            return makeChange(coins,money,0,new HashMap<String, Long>());
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int coins[] = new int[m];
        for(int coins_i=0; coins_i < m; coins_i++){
            coins[coins_i] = in.nextInt();
        }
        System.out.println(makeChange(coins, n));
    }
}

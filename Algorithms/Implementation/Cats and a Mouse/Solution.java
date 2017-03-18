import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            int cata = Math.abs(x-z);
            int catb = Math.abs(y-z);
            
            if(cata == catb) System.out.println("Mouse C");
            else System.out.println((cata < catb)?"Cat A":"Cat B");
        
        }
        
      
    }
}

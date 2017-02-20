import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

        
    
public static char[] nextPermutation(String s) {
		// Find non-increasing suffix
    
        char array[] = s.toCharArray();
		int i = array.length - 1;
		while (i > 0 && array[i - 1] >= array[i])
			i--;
		if (i <= 0)
		//	return false;
		return "no answer".toCharArray();
		// Find successor to pivot
		int j = array.length - 1;
		while (array[j] <= array[i - 1] )
			j--;
		char temp = array[i - 1];
		array[i - 1] = array[j];
		array[j] = temp;
		
		// Reverse suffix
		j = array.length - 1;
		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
    //System.out.println(array);
		//return true;
     return array;
	}
    
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan = new Scanner(System.in);
        
        int t= scan.nextInt();
        
        for(int i=0;i<t;i++)
        {
            String s= scan.next();
            System.out.println(nextPermutation(s));  
        }
        
        
    }
}
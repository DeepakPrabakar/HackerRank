package strings.anagram;

import java.util.Arrays;

public class Solution {

static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        
        char []a_array=a.toLowerCase().toCharArray();
        char []b_array=b.toLowerCase().toCharArray();
        
        Arrays.sort(a_array);
        Arrays.sort(b_array);
        
        return Arrays.equals(a_array,b_array);
        
        
        
    }
	public static void main(String[] args) {
			
		System.out.println(isAnagram("", "Ac"));
		
	}
	
}

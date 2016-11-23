import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		String s = Integer.toBinaryString(n);
		// System.out.println(s);

		int count = 0;
		int prev=0;
		for (int i = 0; i < s.length(); i++) {
			if (i == 0 && s.charAt(i) == '1')
				{
				count++;
				prev=count;
				}

			else if (i != 0) {
				if (s.charAt(i) == '1' && s.charAt(i - 1) == '1')
					count++;

				else if (s.charAt(i) == '1' && s.charAt(i - 1) == '0')
					count = 1;
				
			if(count>prev)prev=count;	
			}

		}
		System.out.println(prev);
	}
}

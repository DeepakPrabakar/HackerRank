package string.tagcontent;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		int t=Integer.parseInt(scan.nextLine());
		
		while(t >0)
		{
			String line=scan.nextLine();
			
			Pattern p=Pattern.compile("<(.+)>([^<>]+)</\\1>");
			
			Matcher m=p.matcher(line);
			int count=0;
			while(m.find())
			{
				if(m.group(2).length()!=0)
				{
					System.out.println(m.group(2));
					count++;
				}
				
			}
			if(count==0)System.out.println("None");
			t--;
		}
	}
}

/*
Input:
4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>

Output:
Nayeem loves counseling
Sanjay has no watch
So wait for a while
None
Imtiaz has a secret crush*/
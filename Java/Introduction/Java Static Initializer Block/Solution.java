package com.java;

import java.util.Scanner;

public class Solution {

	//Write your code here
	  
	static int B;
	static int H;
	static boolean flag=true;

	static
	{
	        try{
	            
	            Scanner scan=new Scanner(System.in);
	            B=scan.nextInt();
	            H=scan.nextInt();
	            
	            if(B<=0 || H<=0)
	            {	
	            	flag=false;
	                throw new Exception("Breadth and height must be positive");
	            }
	        }
	    catch(Exception e)
	        {
	        System.out.println(e); 
	        System.exit(0);
	    }
	    
	}


	public static void main(String[] args) {
	
		if(flag)
		{
			int area=B*H;
			System.out.println(area);
		}
	}
}

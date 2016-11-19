package string.exception;

import java.util.Scanner;

class MyCalculator{
    
    public int power(int n,int p) throws Exception
    {
           if(n<0 || p< 0)
               throw new Exception("n and p should be non-negative");
           else
               return (int)Math.pow(n,p);
        
    }
} 
public class Solution {

	//Write your code here

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		while(scan.hasNextInt())
		{
			int n=scan.nextInt();
			int p=scan.nextInt();
			
			MyCalculator mycal=new MyCalculator();
			try
			{
				System.out.println(mycal.power(n, p));
			}
			catch(Exception e)
			{
				System.err.println(e);
			}
		}
		
	}
}

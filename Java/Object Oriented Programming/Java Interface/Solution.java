package oop.interfac;

import java.util.Scanner;

interface AdvancedArithmetic{
	int divisorSum(int n);
	
}
class MyCalculator implements AdvancedArithmetic{
    
    public int divisorSum(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
            if(n%i==0)sum=sum+i;
         return sum;
    }
}
public class Solution {
	
	public static void main(String[] args) {
		
		MyCalculator mc=new MyCalculator();
		System.out.println("I implemented");
		ImplementedInterfaceName(mc);
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		System.out.println(mc.divisorSum(n));
		sc.close();
	}
	
	static void ImplementedInterfaceName(Object o)
	{
		Class[] theInterfaces=o.getClass().getInterfaces();
		
		for(int i=0;i<theInterfaces.length;i++)
		{
			String interfaceName=theInterfaces[i].getName();
			
			System.out.println(interfaceName);
		}
	}

}

/*
I implemented
oop.interfac.AdvancedArithmetic*/
package oop.calcvolume;

import java.io.IOException;
import java.util.Scanner;


class Calculate{
    
    Scanner scan=new Scanner(System.in);
    Calculate output;
    
    public static void display(double volume)
     {
        System.out.printf("%.3f\n", volume);
       //  System.out.println(String.format("%.3f", volume));
    }
        
    
    public static Calculate do_calc() throws IOException
    {
        return new Calculate();   
    }
    public int get_int_val()
    {
        return scan.nextInt();    
    }
    public double get_double_val()
    {
        return scan.nextDouble();    
    }
    
    
    public static int get_volume(int a) throws NumberFormatException
    {
        if(a<=0)
            throw new NumberFormatException("All the values must be positive");
        
        return a*a*a;   
    }
    public static double get_volume(double r)  throws NumberFormatException
    {
          if(r<=0)
            throw new NumberFormatException("All the values must be positive");
      
        return 2*Math.PI*r*r*r/3;   
    }
    public static double get_volume(double r,double h)  throws NumberFormatException
    {
          if(r<=0 || h<=0)
            throw new NumberFormatException("All the values must be positive");
      
        return Math.PI*r*r*h;   
    }
    
    public static int get_volume(int l,int b,int h)  throws NumberFormatException
    {
          if(l<=0 || b<=0|| h<=0)
            throw new NumberFormatException("All the values must be positive");
      
        return l*b*h;   
    }
    
    
  
}
public class Solution {

	public static void main(String[] args) {
		
		try
		{
			Calculate cal=new Calculate();
			int t=cal.get_int_val();
			
			while(t-- > 0)
			{
				double volume=0.0;
				
				int ch=cal.get_int_val();
				
				if(ch==1)
				{
					int a=cal.get_int_val();
					volume=Calculate.do_calc().get_volume(a);
				}
				else if(ch==2)
				{
					int l=cal.get_int_val();
					int b=cal.get_int_val();
					int h=cal.get_int_val();
					
					volume=Calculate.do_calc().get_volume(l,b,h);
				}
				else if(ch==3)
				{
					double r=cal.get_double_val();
					volume=Calculate.do_calc().get_volume(r);
				}
				else if(ch==4)
				{
					double r=cal.get_double_val();
					double h=cal.get_double_val();				
					volume=Calculate.do_calc().get_volume(r,h);
				}
				
			cal.output.display(volume);
			}
			
		}
		catch (NumberFormatException e){
			System.out.println(e);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

/*
Input
1
3
1.02

OUTPUT:
2.223

IN:
2
1
4
4
67.89
-98.54

OP:
64.000
java.lang.NumberFormatException: All the values must be positive
*/
package tutorial.day18;

import java.util.Scanner;

class Node
{
    char data;
    Node next;
    Node(char d)
    {
        this.data=d;
        this.next=null;
    }
    
}
public class Solution {


	    // Write your code here.
	    int top=-1;
	    Node queue;
	    char stack[]=new char[100];
	    
	    
	    public void pushCharacter(char c)
	    {
	       stack[++top]=c;
	    }
	    
	    public void enqueueCharacter(char c)
	    {
	        Node temp=new Node(c);
	        if(queue==null)
	            queue=temp;
	        else if(queue.next==null)
	            queue.next=temp;
	        else
	        {
	                Node start=queue;
	                while(start.next!=null)
	                    start=start.next;
	                start.next=temp;
	        }
	            
	    }
	    
	    public char popCharacter()
	    {
	        char data=stack[top--];
	            return data;    
	    }
	    public char dequeueCharacter()
	    {
	        char data=queue.data;
	        queue=queue.next;
	        return data;
	    }
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		scan.close();
		
		char[] s=input.toCharArray();
		
		Solution p=new Solution();
		
		for(char c:s)
		{
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}
		
		boolean isPalindrome=true;
		for(int i=0;i<s.length/2;i++)
		{
			if(p.popCharacter()!=p.dequeueCharacter()){
				isPalindrome=false;
				break;
			}
		}
		
		System.out.println("the word: "+input+" is "+((!isPalindrome)? "not a palin ": "is a palin" ));
	}
}

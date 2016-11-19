package string.oop;

class Animal{
	
	void walk()
	{
		System.out.println("i am walking");
	}
}

class Bird extends Animal{
	public void fly()
	{
		System.out.println("i am flying");
	}
	void sing()
	{
		System.out.println("i am singing");
	}
}
public class Solution {

	public static void main(String[] args) {
	
		Bird b=new Bird();
		
		b.walk();
		b.fly();
		b.sing();
	}
	
}

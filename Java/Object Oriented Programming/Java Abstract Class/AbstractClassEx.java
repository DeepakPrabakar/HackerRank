package string.oop;

abstract class Book
{
	String title;
	
	abstract void setTitle(String s);
	String getTitle()
	{
		return title;
	}
}

class MyBook extends Book{
	
	public void setTitle(String s)
	{
		title=s;
	}
	
}
public class Abstract3 {

	public static void main(String[] args) {
		
		MyBook b=new MyBook();
		
		String t="hi";
		
		b.setTitle(t);
		System.out.println("Title is :"+b.getTitle());
	}
}

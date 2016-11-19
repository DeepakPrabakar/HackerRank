package string.oop;

class Arithmetic {
	public int add(int a, int b) {
		return a + b;
	}
}

class Adder extends Arithmetic {

}

public class Inheritance2 {

	public static void main(String[] args) {

		Adder add = new Adder();
		System.out.println("my super class "
				+ add.getClass().getSuperclass().getName());
		System.out.println(add.add(2, 3));
	}
}

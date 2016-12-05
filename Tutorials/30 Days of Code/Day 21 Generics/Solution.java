package tutorial.day21;

public class Solution {

	public static <T> void printArray(T[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}

	public static <E> void printArray1(E[] generic) {
		for (E element : generic) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {

		Integer[] intArray = { 1, 2, 3 };
		String[] strArray = { "Hello", "World" };

		printArray(intArray);
		printArray(strArray);
		printArray1(intArray);
		printArray1(strArray);
		
		System.out.println(Solution.class.getDeclaredMethods().length);  //3
		//main
		//printArray
		//printArray1		
		if(Solution.class.getDeclaredMethods().length>2)
			System.out.println("You should have only 1 method name printArray");

	}
}

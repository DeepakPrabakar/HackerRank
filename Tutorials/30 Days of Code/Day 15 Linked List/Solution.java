package tutorial.day15;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

public class Solution {

	public static Node insert(Node head, int data) {
		// Complete this method

		Node temp = new Node(data);
		if (head == null)
			return temp;
		else if (head.next == null) {
			head.next = temp;
			return head;
		} else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = temp;
			return head;
		}
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.println(start.data + " ");
			start = start.next;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Node head = null;

		int n = sc.nextInt();

		while (n-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();

	}
}

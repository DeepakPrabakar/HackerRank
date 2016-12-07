package tutorial.day24;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
	Node next;
	int data;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

public class Solution {

	public static Node removeDuplicates(Node head) {
		// Write your code here

		if (head == null)
			return head;

		else if (head.next == null)
			return head;

		else {
			Node start = head;
			while (start.next != null) {
				if (start.data == start.next.data)
					start.next = start.next.next;

				else
					start = start.next;
			}
			return head;
		}

	}

	public static Node insert(Node head, int data) {
		Node p = new Node(data);

		if (head == null)
			head = p;

		else if (head.next == null)
			head.next = p;

		else {
			Node start = head;
			while (start.next != null)
				start = start.next;

			start.next = p;
		}
		return head;
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
		int t = sc.nextInt();
		while (t-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}

		head = removeDuplicates(head);
		display(head);

	}
}

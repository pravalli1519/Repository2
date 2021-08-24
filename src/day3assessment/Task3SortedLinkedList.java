package day3assessment;

import java.util.*;

class CreateLinkedList {
	class Node {
		int data;
		Node link;

		Node(int data) {
			this.data = data;
			link = null;
		}
	}

	Node head = null;
	Node tail = null;

	void addNode(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			tail = newnode;
		} else {
			tail.link = newnode;
			tail = newnode;
		}
	}

	void deleteDuplicates() {
		Node temp = head;
		if (temp.link == null) {
			return;
		}
		while (temp.link != null) {
			if (temp.data == temp.link.data) {
				temp.link = temp.link.link;
			} else
				temp = temp.link;
		}
	}

	void display() {
		Node temp = head;
		if (temp == null)
			System.out.println("no elements in list");
		else {
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.link;
			}
			System.out.println(temp);
		}
	}

}

public class Task3SortedLinkedList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			CreateLinkedList l = new CreateLinkedList();
			int n = sc.nextInt();
			for (int j = 0; j < n; j++) {
				int data = sc.nextInt();
				l.addNode(data);
			}
			l.display();
			l.deleteDuplicates();
			l.display();
		}

	}
}
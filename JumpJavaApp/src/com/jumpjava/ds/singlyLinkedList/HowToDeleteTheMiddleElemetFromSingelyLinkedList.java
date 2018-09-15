/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 13.How to delete the middle of given Singly Linked List in java.
 * */
package com.jumpjava.ds.singlyLinkedList;

public class HowToDeleteTheMiddleElemetFromSingelyLinkedList {

	public static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;

		}

		public static void display(ListNode head) {
			ListNode current = head;
			while (current != null) {
				System.out.print(current.data + "=>");
				current = current.next;
			}
			System.out.println(current);
		}

		public static int size(ListNode head) {

			ListNode current = head;
			int count = 0;
			while (current != null) {
				current = current.next;
				count = count + 1;
			}
			return count;

		}

		public static void delete(ListNode head, int index) {

			ListNode previous = head;
			int counter = 0;

			while (counter < index - 1) {
				counter = counter + 1;
				previous = previous.next;
			}

			ListNode current = previous.next;
			previous.next = current.next;
			current.next = null;
		}

	}

	public static void main(String[] args) {

		ListNode head = new ListNode(18);
		ListNode first = new ListNode(28);
		ListNode second = new ListNode(38);
		ListNode third = new ListNode(48);
		ListNode fourth = new ListNode(58);
		ListNode fifth = new ListNode(68);
		ListNode sixth = new ListNode(78);
		ListNode seventh = new ListNode(88);

		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		/* Comment this you want to delete the node from Odd linked list */
		sixth.next = seventh;

		int size = ListNode.size(head);

		System.out.println("Size of Linked List is =>" + size);
		System.out.println("Before deleting the node Linked List is ");
		ListNode.display(head);

		if (size % 2 == 0) {
			System.out.println("After deleting the node Linked List is ");
			int index = size / 2;

			for (int i = 1; i <= 2; i++) {
				ListNode.delete(head, index - 1);
			}
			ListNode.display(head);
			System.gc();

		} else {
			System.out.println("After deleting the node Linked List is ");
			int index = size / 2;

			ListNode.delete(head, index);
			ListNode.display(head);
			System.gc();

		}

	}
}

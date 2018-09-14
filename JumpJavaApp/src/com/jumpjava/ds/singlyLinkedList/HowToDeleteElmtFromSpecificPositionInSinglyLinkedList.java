/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 12.How to delete the node from a Singly Linked List at a given position in Java.
 * */
package com.jumpjava.ds.singlyLinkedList;

public class HowToDeleteElmtFromSpecificPositionInSinglyLinkedList {

	private static class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

		public static void display(ListNode head) {

			ListNode current = head;
			while (current != null) {

				System.out.print(current.data + " -> ");
				current = current.next;
			}
			System.out.println(current);

		}

		public static void delete(ListNode head, int position) {

			ListNode previous = head;
			int index = position;
			int count = 1;

			while (count < index - 1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
			current.next = null;
		}
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(10);
		ListNode first = new ListNode(20);
		ListNode second = new ListNode(30);
		ListNode third = new ListNode(40);
		ListNode fourth = new ListNode(50);
		ListNode fifth = new ListNode(60);

		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		System.out.println("Before Deleting the Node form Lonked List");
		ListNode.display(head);
		ListNode.delete(head, 4);
		System.gc();
		System.out.println("After Deleting the Node form Lonked List");
		ListNode.display(head);

	}
}

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 15.How to delete the elements except head of given Singly Linked List using loop in java.
 * */

package com.jumpjava.ds.singlyLinkedList;

public class HowToDeleteTheNodeUsingLoopFromSinglyLinkedList {

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
				System.out.print(current.data + " => ");
				current = current.next;
			}
			System.out.println(current);
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

		public static int size(ListNode head) {

			ListNode current = head;
			int count = 0;
			while (current != null) {
				count = count + 1;
				current = current.next;
			}
			return count;
		}

	}

	public static void main(String[] args) {

		ListNode head = new ListNode(11);
		ListNode first = new ListNode(12);
		ListNode second = new ListNode(13);
		ListNode third = new ListNode(14);
		ListNode fourth = new ListNode(15);

		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;

		int size = ListNode.size(head);
		System.out.println("Size of Linked List -> " + size);
		ListNode.display(head);

		for (int i = 0; i < size - 1; i++) {
			ListNode.delete(head, 0);
		}
		ListNode.display(head);
	}
}

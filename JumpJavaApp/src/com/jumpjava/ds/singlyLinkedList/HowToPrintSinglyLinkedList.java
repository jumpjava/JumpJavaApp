/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 3.How to print the element of Singly Linked List in java.
 * */

package com.jumpjava.ds.singlyLinkedList;

public class HowToPrintSinglyLinkedList {

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

				System.out.print(current.data + "->");
				current = current.next;
			}
			System.out.println(current);

		}

	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		ListNode.display(head);

	}

}

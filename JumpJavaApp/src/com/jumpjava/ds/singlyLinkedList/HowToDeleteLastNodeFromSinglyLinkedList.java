/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 10.How to delete last node from a given Singly Linked List in Java.
 * */
package com.jumpjava.ds.singlyLinkedList;

public class HowToDeleteLastNodeFromSinglyLinkedList {

	private static class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

		public static void display(ListNode head) {
			ListNode currrent = head;

			while (currrent != null) {
				System.out.print(currrent.data + " -> ");
				currrent = currrent.next;
			}
			System.out.println(currrent);
		}

		public static void delete(ListNode head) {

			ListNode last = head;
			ListNode beforePrevious = null;

			while (last.next != null) {

				beforePrevious = last;
				last = last.next;
			}
			beforePrevious.next = null;
		}

	}

	public static void main(String[] args) {

		ListNode head = new ListNode(50);
		ListNode second = new ListNode(51);
		ListNode third = new ListNode(52);
		ListNode fourth = new ListNode(53);
		ListNode fifth = new ListNode(54);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		System.out.println("Before Deleting the Last Node");
		ListNode.display(head);
		ListNode.delete(head);
		System.out.println("After Deleting the Last Node");
		ListNode.display(head);

	}
}

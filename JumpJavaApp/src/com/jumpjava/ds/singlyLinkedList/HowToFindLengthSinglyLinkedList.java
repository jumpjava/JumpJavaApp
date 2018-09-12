/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 4.How to find the length of the Singly Linked List in java
 * */

package com.jumpjava.ds.singlyLinkedList;

public class HowToFindLengthSinglyLinkedList {

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

		public static void length(ListNode head) {

			ListNode current = head;
			int count = 0;
			while (current != null) {
				count++;
				current = current.next;
			}
			System.out.println("Length-> " + count);

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
		ListNode.length(head);

	}

}

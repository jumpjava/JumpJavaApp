/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 14.How to delete the duplicate elements from sorted Singly Linked List in java.
 * */

package com.jumpjava.ds.singlyLinkedList;

public class HowToRemoveDuplicateFromSortedLinkedList {

	public static class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

		private static void display(ListNode head) {

			ListNode current = head;
			while (current != null) {
				System.out.print(current.data + " => ");
				current = current.next;
			}
			System.out.println(current);
		}

		private static void deleteDuplicate(ListNode head) {

			ListNode current = head;
			while (current != null && current.next != null) {

				if (current.data == current.next.data) {
					current.next = current.next.next;
				} else {
					current = current.next;
				}
			}

		}
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(23);
		ListNode first = new ListNode(33);
		ListNode second = new ListNode(33);
		ListNode third = new ListNode(53);
		ListNode fourth = new ListNode(63);
		ListNode fifth = new ListNode(63);

		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		System.out.println("Before Deleting the duplicate element");
		ListNode.display(head);
		ListNode.deleteDuplicate(head);
		System.out.println("After Deleting the duplicate element");
		ListNode.display(head);
		System.gc();

	}
}

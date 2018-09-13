/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 11.How to delete the specific element in a given Singly Linked List in java.
 * */
package com.jumpjava.ds.singlyLinkedList;

public class HowToDeleteSpeificElementFromSinglyLinkedList {

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

				System.out.print(current.data + " -> ");
				current = current.next;
			}
			System.out.println(current);
		}

		public static void delete(ListNode head, int element) {

			// TODO need to write the delete function for specific element.

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

		ListNode.display(head);
		ListNode.delete(head, 13);
		ListNode.display(head);

	}

}

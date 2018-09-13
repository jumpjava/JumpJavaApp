/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 8.How to search the specific element in a given Singly Linked List in java.
 * */

package com.jumpjava.ds.singlyLinkedList;

public class HowToSearchElementInSinglyLinkedList {

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

		public static void display(ListNode node) {

			ListNode current = node;

			while (current != null) {
				System.out.print(current.data + " -> ");
				current = current.next;
			}
			System.out.println(current);
		}

		public static void getElement(ListNode node, int element) {

			ListNode current = node;
			boolean isFound = false;

			while (current != null) {
				if (current.data == element) {
					isFound = true;
				}
				current = current.next;
			}

			if (isFound == true) {
				System.out.println("Element Found->" + element);
			} else {
				System.out.println("Element not Found ->" + element);
			}
		}

	}

	public static void main(String[] args) {

		ListNode head = new ListNode(10);
		ListNode first = new ListNode(20);
		ListNode second = new ListNode(30);
		ListNode third = new ListNode(40);
		ListNode fourth = new ListNode(50);

		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;

		ListNode.display(head);
		ListNode.getElement(head, 20);
		ListNode.getElement(head, 150);

	}

}

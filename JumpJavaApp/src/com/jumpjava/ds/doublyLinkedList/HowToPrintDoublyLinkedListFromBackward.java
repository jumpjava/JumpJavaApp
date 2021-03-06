/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 3.How to print the element of Doubly Linked List from backward direction in java.
 * */

package com.jumpjava.ds.doublyLinkedList;

public class HowToPrintDoublyLinkedListFromBackward {

	private ListNode head;
	private ListNode tail;
	private int length;

	public HowToPrintDoublyLinkedListFromBackward() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	private static class ListNode {

		private int data;
		private ListNode next;
		private ListNode previous;

		public ListNode(int data) {
			this.data = data;
		}

	}

	public boolean isEmpty() {
		return length == 0;
	}

	public int length() {
		return length;
	}

	public void insertLast(int value) {

		ListNode newNode = new ListNode(value);

		if (isEmpty()) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		newNode.previous = tail;
		tail = newNode;
		length++;

	}

	public void displayBackward() {
		if (tail == null) {
			return;
		} else {
			ListNode temp = tail;
			while (temp != null) {
				System.out.print(temp.data + "=>");
				temp = temp.previous;
			}
			System.out.println(temp);
		}
	}

	public static void main(String[] args) {

		HowToPrintDoublyLinkedListFromBackward dll = new HowToPrintDoublyLinkedListFromBackward();
		dll.insertLast(11);
		dll.insertLast(21);
		dll.insertLast(31);
		dll.insertLast(41);
		dll.insertLast(51);
		System.out.println("Print the Element from Backword direction");
		dll.displayBackward();
	}

}

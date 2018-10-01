/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 9.How to search the specific element in a given Doubly Linked List in java.
 * */
package com.jumpjava.ds.doublyLinkedList;

public class HowToFindSpecificElementInDLL {

	private ListNode head;
	private ListNode tail;
	private int length;

	public HowToFindSpecificElementInDLL() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	/* Start:Doubly Linked List creation */
	private static class ListNode {

		private int data;
		private ListNode next;
		private ListNode previous;

		public ListNode(int data) {
			this.data = data;
		}

	}
	/* End: Doubly Linked List creation */

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

	public void displayForward() {
		if (head == null) {
			return;
		} else {
			ListNode temp = head;
			while (temp != null) {
				System.out.print(temp.data + "=>");
				temp = temp.next;
			}
			System.out.println(temp);
		}
	}
	
	public void find(int element) {
		boolean isFound = false;

		if (head == null) {
			return;
		} else {
			ListNode temp = head;
			while (temp != null) {
				if (temp.data == element) {
					System.out.print("Element->" + temp.data + " Found");
					isFound = true;
				}
				temp = temp.next;
			}
			if (isFound == false) {
				System.out.println("Element-> " + element + " not Found");
			}
		}
	}

	public static void main(String[] args) {

		HowToFindSpecificElementInDLL dll = new HowToFindSpecificElementInDLL();
		dll.insertLast(31);
		dll.insertLast(41);
		dll.insertLast(51);
		dll.insertLast(61);
		dll.insertLast(71);
		dll.insertLast(81);
		System.out.println("Doubly linked List Element is->");
		dll.displayForward();
		dll.find(321);
		dll.find(31);

	}
}

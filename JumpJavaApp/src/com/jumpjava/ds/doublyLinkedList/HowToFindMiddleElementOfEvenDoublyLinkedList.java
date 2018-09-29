/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 8.How to Print the Middle element of a given Doubly Linked List which has total even number of elements
 * */
package com.jumpjava.ds.doublyLinkedList;


public class HowToFindMiddleElementOfEvenDoublyLinkedList {

	private ListNode head;
	private ListNode tail;
	private int length;

	public HowToFindMiddleElementOfEvenDoublyLinkedList() {

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
	
	/* Start:Insert Element in to DLL */
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
	/* End:Insert Element in to DLL */
	
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

	public void displayMiddle(int middle) {
		int counter = 1;
		if (head == null) {
			return;
		} else {
			ListNode temp = head;
			while (temp != null) {
				if (counter == middle) {
					System.out.println("Middle Element is ->" + temp.data+" of Index ->"+middle);
				}
				temp = temp.next;
				counter = counter + 1;
			}
		}
	}

	public static void main(String[] args) {

		HowToFindMiddleElementOfEvenDoublyLinkedList dll = new HowToFindMiddleElementOfEvenDoublyLinkedList();
		dll.insertLast(11);
		dll.insertLast(12);
		dll.insertLast(13);
		dll.insertLast(14);
		dll.insertLast(15);
		dll.insertLast(16);
		System.out.println("Doubly linked List Element is->");
		dll.displayForward();
		int length = dll.length;
		System.out.println("Length of DLL is -> " + length);

		if (length % 2 == 0) {
			int middle = length / 2;
			for (int i = 1; i <= 2; i++) {
				dll.displayMiddle(middle);
				middle = middle + 1;
			}

		}

	}
}

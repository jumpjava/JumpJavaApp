/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 9.How to Print the Middle element of a given Doubly Linked List which has  total even and Odd both number of elements.
 * */
package com.jumpjava.ds.doublyLinkedList;


public class HowToFindMiddleElementOfDoublyLinkedList {

	private ListNode head;
	private ListNode tail;
	private int length;

	public HowToFindMiddleElementOfDoublyLinkedList() {

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
					System.out.println("Middle Element is ->" + temp.data+" at Index ->"+middle);
				}
				temp = temp.next;
				counter = counter + 1;
			}
		}
	}

	public static void main(String[] args) {

		HowToFindMiddleElementOfDoublyLinkedList dll = new HowToFindMiddleElementOfDoublyLinkedList();
		dll.insertLast(11);
		dll.insertLast(12);
		dll.insertLast(13);
		dll.insertLast(14);
		dll.insertLast(15);
	   /*Un-comment this to make DLL size is Even*/
		//	dll.insertLast(16);
		
		System.out.println("Doubly linked List Element is->");
		dll.displayForward();
		int length = dll.length;
		System.out.println("Length of DLL is -> " + length);
		int middle = length / 2;

		if (length % 2 == 0) {
			System.out.println("***DLL has total Even Number of Elements***");
			for (int i = 1; i <= 2; i++) {
				dll.displayMiddle(middle);
				middle = middle + 1;
			}
		} else {
			System.out.println("***DLL has total Odd Number of Elements***");
			dll.displayMiddle(middle+1);
		}
	}
}

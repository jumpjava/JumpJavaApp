/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 7.How to Print the Middle element of a given Doubly Linked List which has total odd number of elements.
 * */

package com.jumpjava.ds.doublyLinkedList;

public class HowToFindFindTheMiddleElementOfOddDoublyLinkedList {

	private ListNode head;
	private ListNode tail;
	private int length;

	public HowToFindFindTheMiddleElementOfOddDoublyLinkedList() {
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

	public void displayMiddle(int middle) {
		int counter = 1;
		if (head == null) {
			return;
		} else {
			ListNode temp = head;
			while (temp != null) {
				if (counter == middle) {
					System.out.println("Middle Element is ->" + temp.data);
				}
				temp = temp.next;
				counter = counter + 1;
			}
		}
	}

	public static void main(String[] args) {

		HowToFindFindTheMiddleElementOfOddDoublyLinkedList dll = new HowToFindFindTheMiddleElementOfOddDoublyLinkedList();
		dll.insertLast(11);
		dll.insertLast(21);
		dll.insertLast(31);
		dll.insertLast(41);
		dll.insertLast(51);
		System.out.println("Print the Element from Forward direction");
		dll.displayForward();
		System.out.println("Length of Linked List is -> " + dll.length());
		int middleindex=dll.length()/2;
		middleindex=middleindex+1;
		System.out.println("Middle index is -> "+middleindex);
		dll.displayMiddle(middleindex);
	}

}

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 12.How to delete last node from a given Doubly Linked List in Java.
 * */
package com.jumpjava.ds.doublyLinkedList;

public class HowToRemoveLastElementFromDLL {

	private ListNode head;
	private ListNode tail;
	private int length;

	public HowToRemoveLastElementFromDLL() {

		this.head = null;
		this.tail = null;
		this.length = 0;
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

	public ListNode delete() {

		if (isEmpty()) {
			System.out.println("Given DLL is Empty");
		}

		ListNode tmp = tail;
		if (tail == head) {
			head = null;
		} else {
			tail.previous.next = null;
		}

		tail = tail.next;
		tmp.previous = null;
		length--;
		return tmp;

	}

	public void display() {
		if (head == null) {
			return;
		} else {
			ListNode tmp = head;
			while (tmp != null) {
				System.out.print(tmp.data + "=>");
				tmp = tmp.next;
			}
			System.out.println(tmp);
		}
	}

	public static class ListNode {

		private ListNode next;
		private ListNode previous;
		private int data;

		public ListNode(int data) {
			this.data = data;

		}

	}

	public static void main(String[] args) {

		HowToRemoveLastElementFromDLL dll = new HowToRemoveLastElementFromDLL();

		dll.insertLast(21);
		dll.insertLast(22);
		dll.insertLast(23);
		dll.insertLast(24);
		dll.insertLast(25);
		dll.insertLast(26);
		dll.insertLast(27);

		System.out.println("Before Deleting the Element from DLL-");
		dll.display();
		System.out.println("Before Length of DLL is -> " + dll.length);

		dll.delete();
		System.gc();

		System.out.println("After Deleting the Element from DLL-");
		dll.display();
		System.out.println("After Length of DLL is -> " + dll.length);
	}

}

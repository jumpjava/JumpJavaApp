/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 14.How to delete the specific element[Other then First and Last node] in a given Doubly Linked List in java.
 * */
package com.jumpjava.ds.doublyLinkedList;

public class HowToRemoveSpecificElementFromDLL {

	private ListNode head;
	private ListNode tail;
	private int length;

	public HowToRemoveSpecificElementFromDLL() {

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

	public void delete(int element) {

		if (head == null) {
			return;
		} else {
			ListNode p = head;
			ListNode store_Next;
			ListNode store_Previous;
			while (p.data != element) {
				p = p.next;
			}
			store_Next = p.next;
			store_Previous = p.previous;
			p = null;
			store_Next.previous = store_Previous;
			store_Previous.next = store_Next;
			length--;
		}

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

		HowToRemoveSpecificElementFromDLL dll = new HowToRemoveSpecificElementFromDLL();

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

		dll.delete(23);
		System.gc();

		System.out.println("After Deleting the Element from DLL-");
		dll.display();
		System.out.println("After Length of DLL is -> " + dll.length);
	}

}

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 18.How to remove a given key/node from a given Singly Linked List in Java. 
 * */
package com.jumpjava.ds.singlyLinkedList;

public class HowToDeleteTheKeyFromGivenSinglyLinkedList {

	private static class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;

		}

		public static void display(ListNode head) {

			ListNode current = head;

			while (current != null) {
				System.out.print(current.data + "=>");
				current = current.next;
			}
			System.out.println(current);

		}

		public static void delete(ListNode head, int key) {

			ListNode p = head;
			ListNode q = head.next;

			while (q.data != key && q != null) {
				p = p.next;
				q = q.next;
			}
			p.next = q.next;
		}
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(12);
		ListNode first = new ListNode(22);
		ListNode second = new ListNode(32);
		ListNode third = new ListNode(42);
		ListNode fourth = new ListNode(52);
		ListNode fifth = new ListNode(62);

		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		System.out.println("Before Delete");
		ListNode.display(head);
		ListNode.delete(head, 42);/* Pass other then head element */
		System.out.println("After Delete");
		ListNode.display(head);

	}
}

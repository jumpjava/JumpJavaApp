/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 9.How to delete first node from a given Singly Linked List in Java
 * */

package com.jumpjava.ds.singlyLinkedList;

public class HowToDeleteFirstNodeFromSinglyLinkedList {

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

		public static ListNode delete(ListNode node) {

			ListNode current = node;
			current = current.next;
			ListNode tmp = current;
			tmp = null;

			return current;

		}

	}

	public static void main(String[] args) {

		ListNode head = new ListNode(40);
		ListNode first = new ListNode(50);
		ListNode second = new ListNode(60);
		ListNode third = new ListNode(70);
		ListNode fourth = new ListNode(80);

		head.next = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		
		System.out.println("Before Deleting the First Node");
		ListNode.display(head);
		ListNode node = ListNode.delete(head);
		System.out.println("After Deleting the First Node");
		ListNode.display(node);
	}
}

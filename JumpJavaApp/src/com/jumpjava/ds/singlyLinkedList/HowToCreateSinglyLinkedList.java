/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 2.How to create the Singly Linked List in Java.
 * */

package com.jumpjava.ds.singlyLinkedList;

public class HowToCreateSinglyLinkedList {

	private static class ListNode {

		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

	}

}

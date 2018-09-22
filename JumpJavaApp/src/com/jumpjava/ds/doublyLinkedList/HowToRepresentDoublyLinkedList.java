/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 1.How to represent a Doubly Linked List in Java.
 * */
package com.jumpjava.ds.doublyLinkedList;

public class HowToRepresentDoublyLinkedList {

	/* Inner class to represent the Doubly Linked List */
	private static class ListNode {

		/*
		 * It has three private member Where, first member is called data representation . 
		 * Second member i.e next is represent the next node .
		 * Third member i.e previous is represent the before next node . 
		 */
		private int data;
		private ListNode next;
		private ListNode previous;

		/*
		 * It has the one constructor which is responsible to initialize the node/data.
		 */
		public ListNode(int data) {
			this.data = data;
		}
	}

}

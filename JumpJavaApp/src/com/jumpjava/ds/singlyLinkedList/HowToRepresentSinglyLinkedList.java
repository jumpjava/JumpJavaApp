/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 1.How to represent a Singly Linked List in Java.
 * */
package com.jumpjava.ds.singlyLinkedList;

public class HowToRepresentSinglyLinkedList {

	/* Inner class to represent the Linked List */
	private static class ListNode {

		/*
		 * It has two private member one is data and another one is the address
		 * of the next node
		 */
		private int data;
		private ListNode next;

		/*
		 * It has the one constructor which is responsible to initialize the
		 * node/data and the address of the next node. Since by default the
		 * address in null for next node
		 */
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {

		/*First node of the Singly Linked List*/
		ListNode node = new ListNode(1);

	}
}

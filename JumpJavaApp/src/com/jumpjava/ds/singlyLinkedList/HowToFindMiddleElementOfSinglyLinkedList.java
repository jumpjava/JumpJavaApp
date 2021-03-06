/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 5.How to Print the Middle element of a given Singly Linked in List.
 * */

package com.jumpjava.ds.singlyLinkedList;

public class HowToFindMiddleElementOfSinglyLinkedList {

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

				System.out.print(current.data + "->");
				current = current.next;
			}
			System.out.println(current);

		}

		public static int length(ListNode head) {

			ListNode current = head;
			int count = 0;
			while (current != null) {
				count++;
				current = current.next;
			}
			return count;

		}

		public static void getMiddleElement(ListNode node, int middleLength) {

			ListNode current = node;
			int count = 0;
			
			while (current != null) {
				count++;
				current = current.next;
				
				if(count==middleLength){
					System.out.println("Middle Element is -> "+current.data);
				}
			}
			
			
			
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
		
		ListNode.display(head);
		int length = ListNode.length(head);
		System.out.println("Length of Linked List is -> " + length);
		int middle = length / 2;
		ListNode.getMiddleElement(head, middle);

	}

}

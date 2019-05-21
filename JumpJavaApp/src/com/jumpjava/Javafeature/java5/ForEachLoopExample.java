/*
 * Author  : JumpJava.com
 * JAVA    : 1.8
 * Program : For Each loop OR Enhanced for each loop example.
 * */

package com.jumpjava.Javafeature.java5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class ForEachLoopExample {

	public static void main(String[] args) {
		System.out.println("Enhanced for Loop OR For-each loop Example");
		System.out.println("********************************************");

		/* 1.Insert the Value in Array */
		int arrayValue[] = ForEachLoopExample.createArrayValue(10);
		/* 1.Get the Value from Array */
		ForEachLoopExample.getArrayValue(arrayValue);

		/* 2.Insert the Value in ArrayList */
		List<Integer> arrayListValue = ForEachLoopExample.createArrayListValue(10);
		/* 2.Get the Value from ArrayList */
		ForEachLoopExample.getArrayListValue(arrayListValue);

		/* 3.Insert the Value in HashSet */
		Set<Integer> hashSetValue = ForEachLoopExample.createHashSetValue(10);
		/* 3.Insert the Value in HashSet */
		ForEachLoopExample.getHashSetValue(hashSetValue);

		/* 4.Insert the Value in HashSet */
		Map<Integer, String> hashMapValue = ForEachLoopExample.createHashMapValue(10);
		/* 4.Insert the Value in HashSet */
		ForEachLoopExample.getHashMapValue(hashMapValue);

		/* 5.Insert the Value in PriorityQueue */
		Queue<Integer> queueValue = ForEachLoopExample.createPriorityQueueValue(10);
		/* 5.Insert the Value in PriorityQueue */
		ForEachLoopExample.getPriorityQueueValue(queueValue);

	}

	public static int[] createArrayValue(int index) {

		int arr[] = new int[10];

		for (int i = 0; i < index; i++) {
			arr[i] = i;
		}
		return arr;
	}

	public static void getArrayValue(int[] arrayValue) {

		System.out.println("START: Fetching the Value of Array using - Enhanced for Loop OR For-each loop");

		for (int i : arrayValue) {
			System.out.print(i + " ");
		}

		System.out.println("\n" + "END: Fetching the Value of Array using - Enhanced for Loop OR For-each loop" + "\n");
	}

	public static List<Integer> createArrayListValue(int size) {

		List<Integer> listValue = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			listValue.add(i);

		}

		return listValue;
	}

	public static void getArrayListValue(List<Integer> arrayListValue) {

		System.out.println("START: Fetching the Value of ArrayList using - Enhanced for Loop OR For-each loop");

		for (Integer value : arrayListValue) {
			System.out.print(value + " ");
		}
		System.out.println("\n" + "END: Fetching the Value of ArrayList using - Enhanced for Loop OR For-each loop" + "\n");
	}

	public static Set<Integer> createHashSetValue(int size) {

		Set<Integer> setValue = new HashSet<Integer>();

		for (int i = 0; i < size; i++) {
			setValue.add(i);

		}
		return setValue;
	}

	public static void getHashSetValue(Set<Integer> hashSetValue) {

		System.out.println("START: Fetching the Value of HashSet using - Enhanced for Loop OR For-each loop");

		for (Integer value : hashSetValue) {

			System.out.print(value + " ");
		}

		System.out
				.println("\n" + "END: Fetching the Value of HashSet using - Enhanced for Loop OR For-each loop" + "\n");
	}

	public static Map<Integer, String> createHashMapValue(int length) {

		Map<Integer, String> mapValue = new HashMap<Integer, String>();

		for (int i = 0; i < length; i++) {

			mapValue.put(i, Integer.toString(i));
		}

		return mapValue;

	}

	public static void getHashMapValue(Map<Integer, String> mapValue) {

		System.out.println("START: Fetching the Value of HashMap using - Enhanced for Loop OR For-each loop" + "\n");

		for (Map.Entry<Integer, String> entry : mapValue.entrySet()) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

		System.out.println("\n" + "END: Fetching the Value of HashMap using - Enhanced for Loop OR For-each loop" + "\n");
	}

	public static Queue<Integer> createPriorityQueueValue(int length) {

		Queue<Integer> queue = new PriorityQueue<Integer>();

		for (int i = 0; i < length; i++) {
			queue.add(i);
		}

		return queue;

	}

	public static void getPriorityQueueValue(Queue<Integer> queue) {

		System.out.println("START: Fetching the Value of PriorityQueue using - Enhanced for Loop OR For-each loop" + "\n");

		for (Integer value : queue) {

			System.out.print(value + " ");

		}

		System.out.println("\n" + "END: Fetching the Value of PriorityQueue using - Enhanced for Loop OR For-each loop" + "\n");

	}
}

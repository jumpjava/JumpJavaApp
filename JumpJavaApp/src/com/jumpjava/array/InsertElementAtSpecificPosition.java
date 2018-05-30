package com.jumpjava.array;
/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 5. Write a Java program to insert an element (specific position) into an array. 
 * */

public class InsertElementAtSpecificPosition {

	public static void main(String[] args) {
		int index = 5;
		int arraysize = 20;
		int element = 10;

		int[] resultarray = InsertElementAtSpecificPosition.insertAtSpecificPosition(index, arraysize, element);

		for (int i = 0; i < resultarray.length; i++) {

			System.out.print(resultarray[i] + " ");
		}
	}

	public static int[] insertAtSpecificPosition(int index, int arraysize, int element) {

		int[] result = new int[arraysize];
		int position = index - 1;

		if (index <= arraysize) {

			for (int i = 0; i < result.length; i++) {

				if (i == position) {
					result[i] = element;
				}
			}

		}
		return result;

	}
}

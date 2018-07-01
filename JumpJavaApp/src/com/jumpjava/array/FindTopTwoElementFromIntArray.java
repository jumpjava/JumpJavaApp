package com.jumpjava.array;

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : How to find top two numbers from an integer array?. 
 * */

public class FindTopTwoElementFromIntArray {

	public static void main(String[] args) {

		int[] intArray = { 1, 2, 3, 4, 21, 44, 55, 7, 7, 90, 89, 100, 500 };
		int[] sortedArray = FindTopTwoElementFromIntArray.srtIntArray(intArray);
		FindTopTwoElementFromIntArray.display(sortedArray);

	}

	public static int[] srtIntArray(int[] inputArray) {

		int[] array = inputArray;
		int tmp;

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length; j++) {

				if (array[i] > array[j]) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;

	}

	public static void display(int[] inputArray) {

		System.out.println("First Top Element " + inputArray[0] + " ");
		System.out.print("Second Top Element " + inputArray[1] + " ");
	}
}

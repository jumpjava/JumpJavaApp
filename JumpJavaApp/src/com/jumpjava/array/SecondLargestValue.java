package com.jumpjava.array;
/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Write a Java program to find the second largest element in an array.
 * */

public class SecondLargestValue {

	public static void main(String[] args) {

		int array[] = { 10, 46, 47, 20, 20, 52, 48, 36, 55, 95 };

		int secondLargrsrElement = SecondLargestValue.getSecondLargestValue(array);
		System.out.println("Second Largest Element -> " + secondLargrsrElement);

	}

	public static int getSecondLargestValue(int[] inputArray) {

		int[] _inputArray = inputArray;

		int secondLargest = _inputArray[0];
		int firstLargest = _inputArray[0];/*
											 * Keeping variable name is little
											 * funny, But for just understanding
											 */

		if (_inputArray.length > 2) {

			for (int i = 0; i < _inputArray.length; i++) {

				if (_inputArray[i] > firstLargest) {

					secondLargest = firstLargest;
					firstLargest = _inputArray[i];

				} else if (_inputArray[i] > secondLargest) {
					secondLargest = _inputArray[i];
				}
			}

			System.out.println("First Largest Element -> " + firstLargest);
		} else {
			System.out.println("Invalid Input");
		}
		return secondLargest;

	}

}

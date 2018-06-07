package com.jumpjava.array;

import java.util.Arrays;

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Write a Java program to remove duplicate elements from an array.
 * */

public class RemoveDuplicateElementFromArray {

	public static void main(String[] args) {

		int array[] = { 10, 46, 47, 20, 52, 48, 36, 55, 20, 95 };
		
		int[] shortedArray = RemoveDuplicateElementFromArray.toShort(array);
		System.out.println("Before removing the Duplicate Element");
		System.out.println(Arrays.toString(shortedArray));
		
		int[] uniqueArray=RemoveDuplicateElementFromArray.toRemove(shortedArray);
		System.out.println("After removing the Duplicate Element");
		System.out.println(Arrays.toString(uniqueArray));
		
	}

	public static int[] toShort(int[] array) {

		int[] inputArray = array;

		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {

				if (inputArray[i] > inputArray[j]) {
					int tmp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = tmp;
				}
			}

		}
		
		return inputArray;

	}

	public static int[] toRemove(int[] array) {

		int j = 0;
		int i = 1;

		int[] inputArray = array;
		
		
		while (i < inputArray.length) {

			if (inputArray[i] == inputArray[j]) {
				i++;
			} else {
				inputArray[++j] = inputArray[i++];
			}

		}
		
		int[] unique = new int[j + 1];
		
		for (int k = 0; k < unique.length; k++) {

			unique[k] = inputArray[k];
		}

		
		return unique;
	}
}

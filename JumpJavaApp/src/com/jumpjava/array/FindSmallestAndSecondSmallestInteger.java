package com.jumpjava.array;
/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Write a Java program to find smallest and second smallest elements of a given Integer array.
 * */

public class FindSmallestAndSecondSmallestInteger {

	public static void main(String[] args) {

		int[] integerArray = { 1, 34, 89, 2, 43, 34, 65, 67, 98, 10, 100 };

		int[] sortedArray=FindSmallestAndSecondSmallestInteger.getSmallestAndSecondSmallestInteger(integerArray);

		FindSmallestAndSecondSmallestInteger.displayArray(sortedArray);
	}

	public static int[] getSmallestAndSecondSmallestInteger(int[] intArray) {

		int[] inputArray = intArray;
		int temp;

		for (int i = 0; i < inputArray.length; i++) {

			for (int j = 0; j < inputArray.length; j++) {

				if (inputArray[i] > inputArray[j]) {

					temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;

				}
			}

		}
		return inputArray;

	}

	public static void displayArray(int[] intArray) {

		System.out.println("Smallest Element of an Array :"+intArray[intArray.length-1]+" ");
		System.out.println("Second Smallest Element of an Array :"+intArray[intArray.length-2]+" ");
		
	}
}
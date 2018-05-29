package com.jumpjava.array;

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Write a Java program to test if an array contains a specific value. 
 * */

public class FindSpecificValue {

	public static void main(String[] args) {

		int[] inputArray = { 1, 4, 5, 6, 7, 20 };
		int toFind = 7;

		FindSpecificValue.checkSpecificElementOfArray(inputArray, toFind);

	}

	public static void checkSpecificElementOfArray(int[] array, int findvalue) {

		boolean isfound = false;
		int i = 0;

		if (array.length > 0) {
			for (i = 0; i < array.length; i++) {

				if (array[i] == findvalue) {

					isfound = true;
				}

			}
		} else {
			System.out.println("Array is empty");
		}

		if (isfound) {
			System.out.println(findvalue + " Found at " + i + " index");
		} else {
			System.out.println(findvalue + " Not Found ");
		}

	}
}

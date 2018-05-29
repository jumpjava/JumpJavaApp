package com.jumpjava.array;

/*
 * Author : JumpJava.com
 * JAVA : 1.7
 * 
 * */

public class FindIndexOfArrayElement {

	public static void main(String[] args) {

		int[] inputArray = { 1, 4, 5, 6, 7, 20 };

		FindIndexOfArrayElement.getIndexElementOfArray(inputArray);

	}

	public static void getIndexElementOfArray(int[] array) {

		if (array.length > 0) {

			for (int i = 0; i < array.length; i++) {

				System.out.println("Index Of an Array Element : " + array[i] + " is : " + i);
			}

		} else {
			System.out.println("Array is empty");
		}

	}

}

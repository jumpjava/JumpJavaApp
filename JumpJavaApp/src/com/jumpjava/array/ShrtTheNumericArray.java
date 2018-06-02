package com.jumpjava.array;

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 8. Write a Java program to sort the numeric array.
 * */

public class ShrtTheNumericArray {

	public static void main(String[] args) {

		int[] inputArray = { 1, 9, 8, 2, 4, 7, 29 };

		ShrtTheNumericArray.getShortNumericArray(inputArray);

	}

	public static void getShortNumericArray(int[] inputArray) {

		int[] inputArr = inputArray;

		for (int i = 0; i < inputArr.length; i++) {

			for (int j = i + 1; j < inputArr.length; j++) {

				if (inputArr[i] > inputArr[j]) {

					int tmp = inputArr[i];
					inputArr[i] = inputArr[j];
					inputArr[i] = tmp;
				}

			}

		}

		for (int i = 0; i < inputArr.length; i++) {

			System.out.print(inputArr[i]+" ");
		}

	}
}

package com.jumpjava.array;
/*
 * Author : JumpJava.com
 * JAVA : 1.7
 * */

public class ArrayValueSum {

	public static void main(String[] args) {

		int[] inputArray = { 1, 4, 5, 6, 7, 20 };

		int result = ArrayValueSum.getSumOfArrayValue(inputArray);
		System.out.println(result);
	}

	public static int getSumOfArrayValue(int[] array) {

		int[] inputArray = array;
		int sum = 0;
		
		if (array.length > 0) {
			for (int i = 0; i < inputArray.length; i++) {

				sum = sum + inputArray[i];

			}

		} else {
			System.out.println("Array is empty");
		}

		return sum;

	}
}

package com.jumpjava.array;

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 6. Write a Java program to find the maximum and minimum value of an array.
 * */

public class MaxAndMinElement {

	public static void main(String[] args) {

		int[] array = { 1, 5, 9, 50, 20, 30 };
		
		int max = MaxAndMinElement.findMaxValue(array);
		int min = MaxAndMinElement.findMinValue(array);
		
		System.out.println("Max Value is :" + max + " Min Value is : " + min);

	}

	public static int findMaxValue(int[] inputArray) {
		int maxValue = inputArray[0];
		
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}

	public static int findMinValue(int[] inputArray) {
		int minValue = inputArray[0];
		
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
		}
		return minValue;
	}
}

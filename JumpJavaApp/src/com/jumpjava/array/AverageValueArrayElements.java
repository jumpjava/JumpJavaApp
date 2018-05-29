package com.jumpjava.array;

/*
 * Author : JumpJava.com
 * JAVA : 1.7
 * 
 * */

public class AverageValueArrayElements {

	public static void main(String[] args) {

		int[] inputArray = { 1, 4, 5, 6, 7, 20 };

		double avg = AverageValueArrayElements.getAvgValueArrayElements(inputArray);
		System.out.println(avg);

	}

	public static double getAvgValueArrayElements(int[] array) {

		int[] inputArray = array;
		double sum = 0;
		double avg = 0;

		if (array.length > 0) {
			for (int i = 0; i < inputArray.length; i++) {

				sum = sum + inputArray[i];

			}

			avg = sum / inputArray.length;

		} else {
			System.out.println("Array is empty");
		}

		return avg;

	}

}

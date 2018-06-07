package com.jumpjava.array;
/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : 10. How to merge sorted integer array.
 * */

public class MergeShortedArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8 };

		int[] firstShortedArray = MergeShortedArray.getShortedArray(arr1);

		for (int i = 0; i < firstShortedArray.length; i++) {

			System.out.println("First Shorted Array- " + firstShortedArray[i]);
		}
		int[] secondShortedArray = MergeShortedArray.getShortedArray(arr2);

		for (int i = 0; i < secondShortedArray.length; i++) {

			System.out.println("Second Shorted Array- " + secondShortedArray[i]);
		}

		int[] meargedShortedArray = MergeShortedArray.getMeargedArray(firstShortedArray, secondShortedArray);

		for (int i = 0; i < meargedShortedArray.length; i++) {

			System.out.println("Mearged Array - " + meargedShortedArray[i]);
		}

	}

	public static int[] getShortedArray(int[] inputArray) {

		int[] inputfirstArray = inputArray;

		for (int i = 0; i < inputfirstArray.length; i++) {

			for (int j = i + 1; j < inputfirstArray.length; j++) {

				int tmp = inputfirstArray[i];
				inputfirstArray[i] = inputfirstArray[j];
				inputfirstArray[j] = tmp;
			}
		}
		return inputfirstArray;

	}

	public static int[] getMeargedArray(int[] firstArray, int[] secondArray) {
		int i = 0, j = 0, k = 0;

		int[] inputfirstArray = firstArray;
		int[] inputSecondArray = secondArray;
		int meargedArray[] = new int[inputfirstArray.length + inputSecondArray.length];

		while (i < inputfirstArray.length && j < inputSecondArray.length) {

			if (inputfirstArray[i] < inputSecondArray[j])
				meargedArray[k++] = inputfirstArray[i++];
			else
				meargedArray[k++] = inputSecondArray[j++];
		}

		while (i < inputfirstArray.length) {
			meargedArray[k++] = inputfirstArray[i++];
		}

		while (j < inputSecondArray.length) {
			meargedArray[k++] = inputSecondArray[j++];
		}

		return meargedArray;
	}
}

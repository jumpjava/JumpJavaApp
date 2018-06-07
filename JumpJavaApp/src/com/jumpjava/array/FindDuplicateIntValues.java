package com.jumpjava.array;

public class FindDuplicateIntValues {

	public static void main(String[] args) {

		int arr[] = { 19, 24, 19, 36, 47, 24 };
		int[] outputArray = FindDuplicateIntValues.getDuplicateIntValues(arr);
		for (int i = 0; i < outputArray.length; i++) {

			System.out.println(outputArray[i]);
		}
	}

	public static int[] getDuplicateIntValues(int[] arr) {

		int[] inputArray = arr;
		int newlength = 0;
		int[] tmpArray = new int[inputArray.length];

		for (int i = 0; i < inputArray.length; i++) {

			for (int j = i; j < inputArray.length; j++) {

				if (i != j && inputArray[i] == inputArray[j]) {

					newlength++;

					tmpArray[i] = inputArray[i];
				}
			}
		}

		int[] outputArray = new int[newlength];

		for (int i = 0; i < outputArray.length; i++) {

			outputArray[i] = tmpArray[i];

		}

		return outputArray;
	}

}

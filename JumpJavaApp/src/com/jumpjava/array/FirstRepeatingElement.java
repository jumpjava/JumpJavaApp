package com.jumpjava.array;

public class FirstRepeatingElement {

	public static void main(String[] args) {

		int arr[] = { 19, 24, 19, 36, 47, 24 };
		int firstNonRepeating = FirstRepeatingElement.getFirstRepeatingElemet(arr);

		System.out.println(firstNonRepeating);
	}

	public static int getFirstRepeatingElemet(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (i != j && arr[i] == arr[j]) {

					return arr[i];
				}

				break;
			}
		}

		return 0;

	}
}

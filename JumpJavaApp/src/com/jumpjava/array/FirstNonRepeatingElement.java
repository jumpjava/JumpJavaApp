package com.jumpjava.array;

public class FirstNonRepeatingElement {

	public static void main(String[] args) {

		int arr[] = { 19, 24, 19, 36, 47, 24 };
		int firstNonRepeating = FirstNonRepeatingElement.getFirstNonRepeatingElemet(arr);

		System.out.println(firstNonRepeating);
	}

	public static int getFirstNonRepeatingElemet(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {

			int j;

			for (j = 0; j < n; j++) {

				if (i != j && arr[i] == arr[j])
					break;
			}
			if (j == n)
				return arr[i];

		}
		return -1;

	}
}

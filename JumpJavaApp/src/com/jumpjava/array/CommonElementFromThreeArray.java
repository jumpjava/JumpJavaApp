package com.jumpjava.array;
/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Write a Java program to find common elements from three sorted (in non-decreasing order) arrays.
 * */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CommonElementFromThreeArray {

	public static void main(String[] args) {

		int arr_1[] = { 19, 1, 24, 1, 19, 1, 36, 1, 47, 1, 24, 24, 24, 89, 89, 89 };
		int arr_2[] = { 19, 1, 24, 1, 19, 1, 36, 1, 89, 89 };
		int arr_3[] = { 19, 36, 1, 47, 1, 24, 24, 24, 89, 89, 89 };

		int[] sorterArray_1 = CommonElementFromThreeArray.sortedSet(arr_1);
		int[] sorterArray_2 = CommonElementFromThreeArray.sortedSet(arr_2);
		int[] sorterArray_3 = CommonElementFromThreeArray.sortedSet(arr_3);
		
		/* You can use below API also to sort the Array Element*/
		
		/*Arrays.sort(arr_1);
		Arrays.sort(arr_2);
		Arrays.sort(arr_3);*/

		Set<Integer> commmonElement = CommonElementFromThreeArray.
				findCommonElement(sorterArray_1, sorterArray_2,	sorterArray_3);
		
		CommonElementFromThreeArray.displayCommonElement(commmonElement);

	}

	public static int[] sortedSet(int arr[]) {

		int[] inputArray = arr;
		int tmp = 0;
		for (int i = 0; i < inputArray.length; i++) {

			for (int j = i + 1; j < inputArray.length; j++) {

				if (inputArray[i] > inputArray[j]) {

					tmp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = tmp;
				}
			}

		}

		return inputArray;

	}

	public static Set<Integer> findCommonElement(int arr_1[], int arr_2[], int arr_3[]) {

		Set<Integer> commmonElement = new HashSet<>();

		for (int i = 0; i < arr_1.length; i++) {

			for (int j = 0; j < arr_2.length; j++) {

				for (int k = 0; k < arr_3.length; k++) {

					if (arr_1[i] == arr_2[j] && arr_2[j] == arr_3[k] && arr_3[k] == arr_1[i]) {
						commmonElement.add(arr_1[i]);
					}
				}
			}
		}
		return commmonElement;
	}

	public static void displayCommonElement(Set<Integer> commmonElement) {

		Iterator<Integer> itr = commmonElement.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}
}

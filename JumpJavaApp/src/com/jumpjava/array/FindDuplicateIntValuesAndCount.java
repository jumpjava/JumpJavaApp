package com.jumpjava.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/*
 * Author  : JumpJava.com
 * JAVA    : 1.7
 * Program : Write a java program to find the most frequent element in an Integer array.
 * */

public class FindDuplicateIntValuesAndCount {

	public static void main(String[] args) {

		int arr[] = { 19, 1, 24, 1, 19, 1, 36, 1, 47, 1, 24, 24, 24, 89, 89, 89 };

		Map<Integer, Integer> map = FindDuplicateIntValuesAndCount.getDuplicateCount(arr);

		FindDuplicateIntValuesAndCount.displayValue(map);

	}

	public static Map<Integer, Integer> getDuplicateCount(int[] arr) {

		int[] inputArray = arr;

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < inputArray.length; i++) {

			int key = 0;

			for (int j = 0; j < inputArray.length; j++) {

				if (inputArray[i] == inputArray[j]) {
					key++;
				}
			}
			if (key > 1) {
				map.put(key, inputArray[i]);
			}

		}
		return map;

	}

	public static void displayValue(Map<Integer, Integer> map) {

		Set<Integer> keyset = map.keySet();
		TreeSet<Integer> treeadd = new TreeSet<Integer>();
		treeadd.addAll(keyset);

		int lastKey = treeadd.last();

		System.out.println("Value : " + map.get(lastKey) + " Occures Max : " + lastKey + " Times");

	}
}
